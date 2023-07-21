package java_lab.CO6.tcp_ip;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost:12345
            Socket clientSocket = new Socket("localhost", 12345);

            // Set up input and output streams for communication with the server
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read user input from the console and send it to the server
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            do {
                System.out.print("Enter a message (or 'exit' to quit): ");
                message = userInput.readLine();
                outToServer.println(message); // Send the message to the server

                String response = inFromServer.readLine();
                System.out.println("Server response: " + response);
            } while (!message.equalsIgnoreCase("exit"));

            // Close the connection with the server
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

