package java_lab.CO4;
import java.util.*;

class objectClass {
    int Number;
    String Name;
    objectClass(int Number,String Name){
        this.Number = Number;
        this.Name = Name;
    }
    void getElement(){
        System.out.println("Number :" + this.Number + " Name : " + this.Name);
    }
}
public class Question12 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        Stack<objectClass> stack =new Stack<>();

        System.out.println("How many number want to insert:");
        int length = scan.nextInt();
        for (int i = 0; i < length; i++){
            System.out.println("Enter the Roll.No: and the Name of the Student:");
            int Number = scan.nextInt();
            String Name = scan.next();
            objectClass obj1 = new objectClass(Number,Name);
            stack.push(obj1);
        }

        System.out.println("Before pop");
        for(int i = stack.size() - 1; i >= 0 ; i--)
            stack.get(i).getElement();
//        Iterator it = stack.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        System.out.println("How many number want to remove:");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the index you want pop");
            int index = scan.nextInt();
            stack.get(index).getElement();
            System.out.println("Removed");
            stack.remove(index);
        }
        System.out.println("\nAfter popping:");
        for(int i = stack.size() - 1; i >= 0 ; i--)
            stack.get(i).getElement();

        stack.removeAllElements();
        System.out.println("\nAfter removing elements:");
        for(objectClass obj : stack){
            obj.getElement();
        }
    }
}
