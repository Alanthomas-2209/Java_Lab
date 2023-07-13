package java_lab.CO6;
import java.io.File;
import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // List all subdirectories and files
        List<String> subdirectories = new ArrayList<>();
        List<String> files = new ArrayList<>();

        listSubdirectoriesAndFiles(directoryPath, subdirectories, files);

        System.out.println("\nSubdirectories:");
        for (String subdirectory : subdirectories) {
            System.out.println(subdirectory);
        }

        System.out.println("\nFiles:");
        for (String file : files) {
            System.out.println(file);
        }

        // Search for a file by name
        List<String> searchResults = searchFileByName(directoryPath, fileName);

        if (searchResults.isEmpty()) {
            System.out.println("\nFile not found: " + fileName);
        } else {
            System.out.println("\nSearch results for file: " + fileName);
            for (String filePath : searchResults) {
                System.out.println(filePath);
            }
        }

        scanner.close();
    }

    public static void listSubdirectoriesAndFiles(String directoryPath, List<String> subdirectories, List<String> files) {
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory: " + directoryPath);
            return;
        }

        File[] fileList = directory.listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                if (file.isDirectory()) {
                    subdirectories.add(file.getName());
                    listSubdirectoriesAndFiles(file.getAbsolutePath(), subdirectories, files);
                } else {
                    files.add(file.getName());
                }
            }
        }
    }

    public static List<String> searchFileByName(String directoryPath, String fileName) {
        List<String> searchResults = new ArrayList<>();
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory: " + directoryPath);
            return searchResults;
        }

        File[] fileList = directory.listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                if (file.isDirectory()) {
                    searchResults.addAll(searchFileByName(file.getAbsolutePath(), fileName));
                } else {
                    if (file.getName().equalsIgnoreCase(fileName)) {
                        searchResults.add(file.getAbsolutePath());
                    }
                }
            }
        }
        return searchResults;
    }
}
