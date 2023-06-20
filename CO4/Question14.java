package java_lab.CO4;
import java.util.*;

public class Question14 {
    static Deque<Integer> queue = new ArrayDeque<>();
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many number want to insert:");
        int n = scan.nextInt();
        System.out.println("Enter the numbers to Enqueue:");
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            queue.add(value);
        }
        display();
        System.out.println("\nHow many number want to Deque:");
        int nToDelete = scan.nextInt();
        for (int i = 0; i < nToDelete; i++) {
            queue.pop();
        }
        display();
    }
    public static void display() {
        System.out.println("Iterate through queue using Iterator:");
        Iterator iterator = queue.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + "->");
    }
}
