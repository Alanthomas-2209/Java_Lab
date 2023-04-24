package java_lab.CO4;
import java.security.PublicKey;
import java.util.*;

class FibonacciThread implements Runnable {
    private int n ;
    FibonacciThread (int n){
        this.n = n;
    }
    public void run () {
        int first = 0,second = 1;
        System.out.println("Fibonacci Series:");
        for( int i = 0; i < n; i++) {
            System.out.println(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println();
    }
}

class EvenNumberThread implements Runnable {
    private int n;
    EvenNumberThread(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Even Number:");
        for (int i = 1; i <= n; i++) {

            System.out.println( i * 2 + " ");
        }
        System.out.println();
    }
}
public class Question6 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = scan.nextInt();

        FibonacciThread Fib = new FibonacciThread(n);
        Thread F = new Thread(Fib);
        F.start();

        EvenNumberThread Even = new EvenNumberThread(n);
        Thread E = new Thread(Even);
        E.start();
    }
}
