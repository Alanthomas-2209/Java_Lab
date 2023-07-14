package java_lab.CO4;
import java.util.*;

public class Question14 {

    public static void main(String[] Args){
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        int choice = 1;

        System.out.println("OPTIONS:\n1.Insertion at Rear\n2.Insertion at Front\n3.Display\n4.Remove from Front\n5.Removed from last\n0.Exit");
        while (choice != 0) {
            System.out.println("\nEnter the choice:");
            choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("How many number want to insert:");
                    int n = scan.nextInt();
                    System.out.println("Enter the numbers to Enqueue:");
                    for (int i = 0; i < n; i++) {
                        int value = scan.nextInt();
                        queue.offerLast(value);
                    }
                }
                case 2 -> {
                    System.out.println("How many number want to insert:");
                    int n = scan.nextInt();
                    System.out.println("Enter the numbers to Enqueue:");
                    for (int i = 0; i < n; i++) {
                        int value = scan.nextInt();
                        queue.offerFirst(value);
                    }
                }
                case 3 -> {
                    System.out.println("Iterate through queue using Iterator:");
                    Iterator iterator = queue.iterator();
                    while (iterator.hasNext())
                        System.out.print(iterator.next() + "->");
                }
                case 4 -> {
                    System.out.println("The element removed from the Front: " + queue.pollFirst());
                    System.out.println("Queue After operation: " + queue);
                }
                case 5 -> {
                    System.out.println("The element removed from the last: " + queue.pollLast());
                    System.out.println("Queue After operation: " + queue);
                }
                case 0 -> {
                    System.out.println("Exiting.....");
                }
                default -> {
                    System.out.println("Invalid Operation....! Please try again...");
                }
            }
        }
    }
}
