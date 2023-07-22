package java_lab.CO6.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        final String serverAddress = "192.168.1.62";
        final int serverPort = 12345;

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            System.out.println("UDP Client started.");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                // Get user input
                System.out.print("Enter a message to send (or 'exit' to quit): ");
                String clientMessage = scanner.nextLine();

                if ("exit".equalsIgnoreCase(clientMessage)) {
                    System.out.println("Client exiting.");
                    break;
                }

                // Prepare the message to send
                byte[] sendBuffer = clientMessage.getBytes();
                InetAddress serverIPAddress = InetAddress.getByName(serverAddress);

                // Send the message to the server
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverIPAddress, serverPort);
                clientSocket.send(sendPacket);

                // Receive the response from the server
                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                clientSocket.receive(receivePacket);

                String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from server: " + serverResponse);
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
