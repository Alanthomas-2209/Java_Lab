package java_lab.CO4;
import java.util.ArrayList;
import java.util.Scanner;

class genericStack<T> {
    ArrayList<T> gStack;
    int size;
    int top = -1;
    Scanner scan = new Scanner(System.in);
    genericStack (int size) {
        this.size = size;
        this.gStack = new  ArrayList<T>(size);
    }

    void push(String check) {
        if(top + 1 >= size){
            System.out.println("Stack Overflow");
        }
        else{
            top = top + 1;
            System.out.println("Enter the data :");
            if (check.equals("Integer")) {
                int data = scan.nextInt();
                gStack.add((T) Integer.valueOf(data));
            } else {
                String data = scan.next();
                gStack.add((T) data);
            }
        }
    }

    void  pop(){
        if(gStack.isEmpty()) {
            System.out.println("Stack is underflow");
        }
        else{
            System.out.println("Popped element :" + gStack.get(top));
            gStack.remove(top--);
        }
    }

    void Display() {
        if(gStack.isEmpty()){
            System.out.println("Stack is  Empty");
        }
        else{
            System.out.print("Stack : ");
            for (int i = 0; i < gStack.size(); i++) {
                System.out.print(gStack.get(i) + "->");
            }
            System.out.println();
        }
    }

    void Top() {
        if(gStack.isEmpty()){
            System.out.println("Stack is  Empty");
        }
        else{
            System.out.println("TOP : " + gStack.get(top));
        }
    }
}
public class Question8 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args){
        System.out.println("Enter the size of the Integer stack :");
        int iSize = scan.nextInt();
        genericStack<Integer> integerStack = new genericStack<>(iSize);
        menuDriven(integerStack,"Integer");

        System.out.println("Enter the size of the String stack :");
        int sSize = scan.nextInt();
        genericStack<String> stringStack = new genericStack<>(sSize);
        menuDriven(stringStack,"String");
    }
    public static <T> void menuDriven(genericStack<T> stack, String check) {
        int choice = 1;
        System.out.println("OPTIONS\n1)Push\n2)Pop\n3)Top\n4)Display\n0)EXIT");
        while (choice != 0) {
            System.out.println("Enter the choice :");
            choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    stack.push(check);
                }
                case 2 -> {
                    stack.pop();
                }
                case 3 -> {
                    stack.Top();
                }
                case 4 -> {
                    stack.Display();
                }
                case 0 -> {
                    System.out.println("EXITED");
                }
                default -> {
                    System.out.println("Invalid Entry....!");
                }
            }
        }
    }
}
