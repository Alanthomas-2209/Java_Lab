package java_lab.CO4;

import java.util.HashMap;
import java.util.*;

class mapServices{
    Scanner scan = new Scanner(System.in);
    void insert(HashMap<Integer,String> hashmap ){
        System.out.println("How many Numbers want to insert:");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Key:");
            int key = scan.nextInt();
            System.out.println("Enter the value");
            String value = scan.next();
            hashmap.put(key,value);
        }
    }
    void delete(HashMap<Integer, String> hashMap){
        System.out.println("How many Numbers want to remove:");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Key:");
            int key = scan.nextInt();
            hashMap.remove(key);
        }
    }
    void  change(HashMap<Integer, String> hashMap){
        System.out.println("Enter the key :");
        int key = scan.nextInt();
        System.out.println("Replace with :");
        String value = scan.next();
        hashMap.replace(key,value);
    }
    void display(HashMap<Integer, String> hashMap){
        System.out.println("HashMap :");
        hashMap.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
//        for (hashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
//            String key = entry.getKey();
//            int value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
    }
}
public class Question17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        mapServices services = new mapServices();
        HashMap<Integer,String> hashmap = new HashMap<>();
        int choice = 1;

        System.out.println("OPTIONS\n1.Insertion\n2.Replace\n3.Deletion\n4.Display\n0.EXIT");
        while(choice != 0) {
            System.out.println("Enter the choice:");
            choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    services.insert(hashmap);
                }
                case 2 -> {
                    services.change(hashmap);
                }
                case 3 -> {
                    services.delete(hashmap);
                }
                case 4 -> {
                    services.display(hashmap);
                }
                case 0 -> {
                    System.out.println("Exiting....");
                }
                default -> {
                    System.out.println("Invalid Choice....;(");
                }
            }
        }
    }
}
