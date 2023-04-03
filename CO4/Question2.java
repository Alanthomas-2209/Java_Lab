package java_lab.CO4;
import java.util.*;
import java_lab.CO4.Arithmetic.Arithmetic;

public class Question2 {
    static Arithmetic object = new Arithmetic();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the two values:");
        float operand1 = scan.nextFloat();
        float operand2 = scan.nextFloat();
        System.out.println("Addition: " + object.Add(operand1, operand2) +"\nSubtraction: "+object.sub(operand1, operand2)+ "\nDivision: "+object.div(operand1, operand2)+"\nMultiplication: " + object.mult(operand1, operand2));

//        System.out.println("OPTIONS(for Arithmetic Operations):\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n0.For Exit");
//        do {
//            System.out.println("Enter the choice:");
//            choice = scan.nextInt();
//            switch (choice){
//                case 1:{
//                    System.out.println("Enter the two values:");
//                    float operand1 = scan.nextFloat();
//                    float operand2 = scan.nextFloat();
//                    System.out.println("Area of Circle :" + object.Add(operand1, operand2));
//                    break;
//                }
//                case 2:{
//                    System.out.println("Enter the two values:");
//                    float operand1 = scan.nextFloat();
//                    float operand2 = scan.nextFloat();
//                    System.out.println("Area of Rectangle:" + object.sub(operand1, operand2));
//                    break;
//                }
//                case 3:{
//                    System.out.println("Enter the two values:");
//                    float operand1 = scan.nextFloat();
//                    float operand2 = scan.nextFloat();
//                    System.out.println("Area of Square:" + object.div(operand1, operand2));
//                    break;
//                }
//                case 4:{
//                    System.out.println("Enter the two values:");
//                    float operand1 = scan.nextFloat();
//                    float operand2 = scan.nextFloat();
//                    System.out.println("Area of Triangle :" + object.mult(operand1, operand2));
//                    break;
//                }
//                case 0:{
//                    System.out.println("Exiting..........");
//                    break;
//                }
//                default:{
//                    System.out.println("Invalid Choice.....!");
//                    break;
//                }
//            }
//        }while(choice!=0);
    }
}
