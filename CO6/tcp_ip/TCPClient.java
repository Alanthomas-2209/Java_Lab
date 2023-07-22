package java_lab.CO6.tcp_ip;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost:12345
            Socket clientSocket = new Socket("192.168.1.62", 12345);

            // Set up input and output streams for communication with the server
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Start a new thread to read messages from the server
            Thread readThread = new Thread(() -> {
                try {
                    String response;
                    while ((response = inFromServer.readLine()) != null) {
                        System.out.println(response); // Print the server response
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            readThread.start();

            // Read user input from the console and send it to the server
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            do {
                System.out.flush(); // Flush the output buffer to display the prompt immediately
                message = userInput.readLine();
                outToServer.println(message); // Send the message to the server
            } while (!message.equalsIgnoreCase("exit"));

            // Close the connection with the server
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
