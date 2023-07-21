package java_lab.CO6.tcp_ip;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket that listens on port 12345
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for a client to connect...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

            // Set up input and output streams for communication with the client
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(), true);

            // Server loop: read input from the client and send back the response
            String message;
            while ((message = inFromClient.readLine()) != null) {
                System.out.println("Received from client: " + message);
                outToClient.println("Server says: " + message); // Echo the message back to the client
            }

            // Close the connection with the client
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
