package java_lab.other;//package java_lab.other;
import java.util.*;
public class linkedList {
    public static void main(String[] Args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        Iterator it = new Iterator();
        for(int num : list){
            System.out.println(num);
        }
        list.removeAll(list);
//        list.clear();
        System.out.println("After pop");
        for(int num : list){
            System.out.println(num);
        }
    }
}
