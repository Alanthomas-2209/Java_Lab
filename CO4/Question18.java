package java_lab.CO4;

import java.util.*;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many Numbers want to insert:");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Key:");
            int key = scan.nextInt();
            System.out.println("Enter the value");
            String value = scan.next();
            hashMap.put(key, value);
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
//        treeMap.putAll(hashMap);
        System.out.println("HashMap :");
        display(hashMap);

        System.out.println("TreeMap :");
        display(treeMap);
    }

    public static <K, V> void  display(Map<K, V> map) {
        map.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
    }
}
