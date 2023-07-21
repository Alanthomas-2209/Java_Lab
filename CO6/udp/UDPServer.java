package java_lab.CO6.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket that listens on port 12345
            DatagramSocket serverSocket = new DatagramSocket(12345);
            System.out.println("Server started. Waiting for a client to connect...");

            // Set up a buffer to receive incoming packets
            byte[] receiveData = new byte[1024];

            while (true) {
                // Receive the incoming DatagramPacket
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                // Convert the received data to a String
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + message);

                // Prepare the response message
                String response = "Server says: " + message;

                // Get the client's address and port from the received packet
                String clientAddress = receivePacket.getAddress().getHostAddress();
                int clientPort = receivePacket.getPort();

                // Convert the response message to bytes
                byte[] sendData = response.getBytes();

                // Create a DatagramPacket to send the response back to the client
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
                        receivePacket.getAddress(), clientPort);

                // Send the response packet
                serverSocket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
