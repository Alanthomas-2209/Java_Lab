package java_lab.CO6.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket for the client
            DatagramSocket clientSocket = new DatagramSocket();

            // Get the server's address (InetAddress) and port number
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 12345;

            // Create a BufferedReader to read user input
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Client loop: read user input and send to the server
            while (true) {
                System.out.print("Enter a message (or 'exit' to quit): ");
                String message = userInput.readLine();

                // Check if the user wants to exit
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                // Convert the message to bytes
                byte[] sendData = message.getBytes();

                // Create a DatagramPacket to send the message to the server
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

                // Send the packet to the server
                clientSocket.send(sendPacket);

                // Set up a buffer to receive the response from the server
                byte[] receiveData = new byte[1024];

                // Create a DatagramPacket to receive the response from the server
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // Receive the response packet from the server
                clientSocket.receive(receivePacket);

                // Convert the response data to a String
                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server response: " + response);
            }

            // Close the client socket when done
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

