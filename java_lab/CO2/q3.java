package java_lab.CO2;
import java.util.*;

class functions {
	String s1,s2;
	Scanner scan = new Scanner(System.in);
	void concat() {
		String s1,s2;
		System.out.println("Enter the First string:");
		s1 = scan.next();
		System.out.println("Enter the Second string:");
		s2 = scan.next();
		
	}
	void change() {
		
	}
}

public class q3 {

	public static void main(String[] args) {
		int choice;
		functions obj = new functions();
		Scanner scan = new Scanner(System.in);
		System.out.println("OPTIONS:\n1.");
		
		do {
			System.out.println("Enter the choice:");
			choice = scan.nextInt();
			switch(choice) {
			case 1: obj.concat();
			}
		}while(choice != 0);
		scan.close();
	}
	
}
