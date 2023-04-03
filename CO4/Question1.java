package java_lab.CO4;

import java_lab.CO4.Graphics.Calculations;
import java.util.*;
public class Question1 {
    static Calculations object = new Calculations();
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("OPTIONS(for finding area):\n1.Circle\n2.Rectangle\n3.Square\n4.Triangle\n0.For Exit");
        do {
            System.out.println("Enter the choice:");
            choice = scan.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter the Radius:");
                    float radius = scan.nextFloat();
                    System.out.println("Area of Circle :" + object.Circle(radius));
                    break;
                }
                case 2:{
                    System.out.println("Enter the Length and Breadth:");
                    float length = scan.nextFloat();
                    float breadth = scan.nextFloat();
                    System.out.println("Area of Rectangle:" + object.Rectangle(length, breadth));
                    break;
                }
                case 3:{
                    System.out.println("Enter the Side:");
                    float side = scan.nextFloat();
                    System.out.println("Area of Square:" + object.Square(side));
                    break;
                }
                case 4:{
                    System.out.println("Enter the base and height:");
                    float base = scan.nextFloat();
                    float height = scan.nextFloat();
                    System.out.println("Area of Triangle :" + object.Triangle(base, height));
                    break;
                }
                case 0:{
                    System.out.println("Exiting..........");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice.....!");
                    break;
                }
            }
        }while(choice!=0);
    }
}
