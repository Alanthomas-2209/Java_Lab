package java_lab.CO6.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        final int serverPort = 12345;

        try (DatagramSocket serverSocket = new DatagramSocket(serverPort)) {
            System.out.println("UDP Server started on port " + serverPort);

            byte[] receiveBuffer = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);

                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + clientMessage);

                // Process the message (if needed)

                // Prepare the response
                String serverResponse = "Hello from UDP Server!";
                byte[] responseBuffer = serverResponse.getBytes();
                InetAddress clientIPAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length,
                        clientIPAddress, clientPort);

                // Send the response back to the client using a separate thread
                new ResponseThread(serverSocket, responsePacket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ResponseThread extends Thread {
        private DatagramSocket socket;
        private DatagramPacket packet;

        public ResponseThread(DatagramSocket socket, DatagramPacket packet) {
            this.socket = socket;
            this.packet = packet;
        }

        @Override
        public void run() {
            try {
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}