package java_lab.CO4;
import java.util.*;
public class Question13 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        PriorityQueue<Integer> queue  = new PriorityQueue<>();
        System.out.println("How many number want to insert:");
        int nInsert = scan.nextInt();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < nInsert; i++) {
            int value = scan.nextInt();
            queue.add(value);
//            queue.offer(value);
        }
        display(queue);
        System.out.println("\nHow many number want to delete:");
        int nDelete = scan.nextInt();
        for (int i = 0; i < nDelete; i++) {
            queue.remove();
        }
        display(queue);
    }
    public static void display(PriorityQueue queue) {
        System.out.println("Iterate through PriorityQueue using Iterator:");
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + "->");
    }
}
