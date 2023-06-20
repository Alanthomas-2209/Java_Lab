package java_lab.CO4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Question15 {
    public static void main(String[] Args){
        Set<Integer> set = new LinkedHashSet<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many number want to insert:");
        int nInsert = scan.nextInt();
        System.out.println("Enter the numbers to Enqueue:");
        for (int i = 0; i < nInsert; i++) {
            int value = scan.nextInt();
            set.add(value);
        }
        display(set);
        System.out.println("\nHow many number want to delete:");
        int nDelete = scan.nextInt();
        System.out.println("Enter the numbers to delete:");
        for (int i = 0; i < nDelete; i++) {
            int value = scan.nextInt();
            set.remove(value);
        }
        display(set);
    }
    public static void display(Set set) {
        System.out.println("Iterate through queue using Iterator:");
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + "->");
    }
}
