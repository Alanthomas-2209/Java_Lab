//package java_lab.CO4;
//import java.util.ArrayList;
//
//class genericStack<T> {
//    ArrayList<T> gStack;
//    int size;
//    int top = -1;
//    genericStack (int size) {
//        this.size = size;
//        this.gStack = new  ArrayList<T>(size);
//    }
//
//    void push( T value) {
//        if(top + 1 >= size){
//            System.out.println("Stack Overflow");
//        }
//        else{
//            top = top + 1;
//            gStack.add(value);
//        }
//    }
//
//    void  pop(){
//        if(gStack.isEmpty()) {
//            System.out.println("Stack is underflow");
//        }
//        else{
//            System.out.println("Popped element :" + gStack.get(top));
//            gStack.remove(top--);
//        }
//    }
//
//    void display() {
//        if(gStack.isEmpty()){
//            System.out.println("Stack is  Empty");
//        }
//        else{
//            System.out.println("TOP : " + gStack.get(top));
//        }
//    }
//
//    void Top() {
//        if(gStack.isEmpty()){
//            System.out.println("Stack is  Empty");
//        }
//        else{
//            System.out.println("TOP : " + gStack.get(top));
//        }
//    }
//}
//public class Question8 {
//    public static void main(String[] Args){
//        int choice = 1;
//        while(choice != 0){
//            System.out.println("Choice\n 1)Integer\n 2)String\n 0)For EXIT");
//            switch (choice){
//                case 1 : {
//                    System.out.println("Enter the ");
//                    genericStack<Integer> stack = new genericStack<Integer>()
//                 break;
//                }
//                case 2 : {
//                    break;
//                }
//                case 0 : {
//                    System.out.println("EXITED");
//                    break;
//                }
//                default : {
//                    System.out.println("Invaid Entry....!");
//                    break;
//                }
//            }
//        }
//    }
//}
