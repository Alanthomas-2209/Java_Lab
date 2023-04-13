package java_lab.CO4;
import java.util.*;
class  MultiplicationTable extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 10:");
        for(int i = 1;i<=10;i++) {
            System.out.printf("10 * %d = %d\n", i ,10*i);
        }
    }
}
class PrimeNumber extends Thread {
    private int n;

    public PrimeNumber(int n) {
        this.n = n;
    }

    public void run() {
        System.out.printf("First %d prime numbers:\n", n);
        int count = 0;
        for (int i = 2; count < n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class Question5 {
    public static void main(String[] Args) {
        MultiplicationTable tableThread = new MultiplicationTable();
        PrimeNumber primeThread = new PrimeNumber(10);

        tableThread.start();
        primeThread.start();
    }
}
