package java_lab.CO6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source file path: ");
        String sourceFilePath = scanner.nextLine();

        System.out.print("Enter the destination file path: ");
        String destinationFilePath = scanner.nextLine();

        try (FileInputStream fileinput = new FileInputStream(sourceFilePath);
             FileOutputStream fileoutput = new FileOutputStream(destinationFilePath)) {

            int i;
            while ((i = fileinput.read()) != -1) {
                fileoutput.write(i);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
