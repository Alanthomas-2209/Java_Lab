package java_lab.CO6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the source file path: ");
            String sourceFilePath = reader.readLine();

            System.out.print("Enter the path for the file to store even numbers: ");
            String evenNumbersFilePath = reader.readLine();

            System.out.print("Enter the path for the file to store odd numbers: ");
            String oddNumbersFilePath = reader.readLine();

            try {
                copyEvenAndOddNumbers(sourceFilePath, evenNumbersFilePath, oddNumbersFilePath);
                System.out.println("Even and odd numbers copied successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while copying the numbers.");
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

    public static void copyEvenAndOddNumbers(String sourceFilePath, String evenNumbersFilePath, String oddNumbersFilePath) throws IOException {
        BufferedReader reader = null;
        BufferedWriter evenWriter = null;
        BufferedWriter oddWriter = null;

        try {
            reader = new BufferedReader(new FileReader(sourceFilePath));
            evenWriter = new BufferedWriter(new FileWriter(evenNumbersFilePath));
            oddWriter = new BufferedWriter(new FileWriter(oddNumbersFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number % 2 == 0) {
                    evenWriter.write(line);
                    evenWriter.newLine();
                } else {
                    oddWriter.write(line);
                    oddWriter.newLine();
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (evenWriter != null) {
                evenWriter.close();
            }
            if (oddWriter != null) {
                oddWriter.close();
            }
        }
    }
}
