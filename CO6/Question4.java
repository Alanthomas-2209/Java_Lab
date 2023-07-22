package java_lab.CO6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the source file: ");
        String sourceFilePath = scanner.nextLine();

        System.out.print("Enter the path for the even numbers file: ");
        String evenFilePath = scanner.nextLine();

        System.out.print("Enter the path for the odd numbers file: ");
        String oddFilePath = scanner.nextLine();

        FileInputStream source = null;
        FileOutputStream destinationEven = null;
        FileOutputStream destinationOdd = null;

        try {
            source = new FileInputStream(sourceFilePath);
            destinationEven = new FileOutputStream(evenFilePath);
            destinationOdd = new FileOutputStream(oddFilePath);

            int i;
            while ((i = source.read()) != -1) {
                if (i % 2 == 0) {
                    destinationEven.write(i);
                } else {
                    destinationOdd.write(i);
                }
            }
            System.out.println("Copied even and odd numbers to respective files.");
        } catch (IOException e) {
            System.out.println("An error occurred during file processing: " + e.getMessage());
        } finally {
            if (source != null) {
                source.close();
            }
            if (destinationEven != null) {
                destinationEven.close();
            }
            if (destinationOdd != null) {
                destinationOdd.close();
            }
            scanner.close();
        }
    }
}
