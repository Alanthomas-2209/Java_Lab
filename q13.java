package java_lab;
import java.util.*;

public class q13 {
    public static void main(String[] Args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offer(4);

        Iterator it = queue.iterator();
        while(it.hasNext()){
          System.out.println(it.next());
        }
        System.out.println(queue.peek());
    }
}
