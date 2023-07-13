package java_lab.CO6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Question3 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the source file location: ");
            String sourceFilePath = reader.readLine();

            System.out.print("Enter the destination file address: ");
            String destinationFilePath = reader.readLine();

            try {
                copyFile(sourceFilePath, destinationFilePath);
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while copying the file.");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading user input.");
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceFilePath);
            outputStream = new FileOutputStream(destinationFilePath);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

