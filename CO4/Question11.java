package java_lab.CO4;
import java.util.*;
public class Question11 {
    public static void main(String[] Args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        int choice = 1;
        System.out.println("Choices\n 1)Insert into beginning\n 2)Insert into specific place\n 3)Insert into end \n"+
                        " 4)Deleted  from  beginning\n 5)Delete form specific place\n 6)Delete from end\n 7)clear\n 8)Display\n 0)Exit\n");

        while(choice != 0){
            System.out.println("Enter the choice:");
            choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the data :");
                    int value = scan.nextInt();
                    list.add(0,value);
                }
                case 2 -> {
                    System.out.println("Enter the data :");
                    int value = scan.nextInt();
                    System.out.println("Enter the data :");
                    int index = scan.nextInt();
                    list.add(index,value);
                }
                case 3 -> {
                    System.out.println("Enter the data :");
                    int value = scan.nextInt();
                    list.add(value);
                }
                case 4 -> {
                    System.out.println("Removed element :" + list.getFirst());
                    list.removeFirst();
                }
                case 5 -> {
                    System.out.println("Enter the Index:");
                    int index = scan.nextInt();
                    System.out.println("Removed element :" + list.get(index));
                    list.remove(index);
                }
                case 6 -> {
                    System.out.println("Removed element :" + list.getLast());
                    list.removeLast();
                }
                case 7 -> {
                    System.out.println("Removed");
                    list.clear();
                }
                case 8 -> {
                    System.out.println("Displaying List");
                    Iterator<Integer> itr=list.iterator();
                    while(itr.hasNext()){System.out.println(itr.next());}
                }
                case 0 -> {
                    System.out.println("Exiting......!");
                }
                default -> {
                    System.out.println("Enter any valid option....!");
                }
            }
        }
    }
}