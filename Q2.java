package java_lab;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class Q2 {
    public static void main(String[] Args) {

        Stack<Integer> stack =new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Before pop");
        for(int num : stack){
            System.out.println(num);
        }

        stack.pop();
        System.out.println("After pop");
        Iterator it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        stack.remove(2);
        System.out.println("After remove by index:");
        for(int num : stack){
            System.out.println(num);
        }
        stack.removeAllElements();
//        stack.remove(3);
//        stack.remove(4);
        System.out.println("After clear");
        for(int num : stack){
            System.out.println(num);
        }
    }
}
