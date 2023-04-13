package java_lab.CO4;
import java.util.*;
public class Question4 {

    public static void main(String[] Args) {
        int sum = 0, count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of integer:");
        int n = scan.nextInt();

        for(int i = 0; i<n; i++) {
            try {
                System.out.printf("Enter Integer #%d:", i+1);
                int num = scan.nextInt();
                if(num<0) {
                    throw new NegativeNumberException("Negative number are not allowed.");
                }
                sum += num;
                count++;
            }catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        double average = (double) sum /count;
        System.out.printf("Average of %d positive is %2f\n", count, average);

    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}