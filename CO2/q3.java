//package java_lab.CO2;
import java.util.*;

class functions {
	Scanner scan = new Scanner(System.in);

	void basic(){
		System.out.println("Enter the  string:");
		String s1 = scan.next();
		System.out.println("The length of the string:" + s1.length());
		System.out.println("converts the string to lowercase: " + s1.toLowerCase());
		System.out.println("converts the string to UPPERCASE:" + s1.toUpperCase());
	}

	void concatenate() {
		String s1,s2;
		System.out.println("Enter the First string:");
		s1 = scan.next();
		System.out.println("Enter the Second string:");
		s2 = scan.next();
		System.out.println( s1.concat(" ").concat(s2));
	}

	void crop () {
		System.out.println("Enter the  string:");
		String s1 = scan.next();
		System.out.println("Enter the starting and ending index of the sub string");
		int start = scan.nextInt();
		int end =  scan.nextInt();
		System.out.println("Substring: " + s1.substring(start,end));
	}

	void split () {
		System.out.println("Enter the String :");
		String str = scan.nextLine();
		String[] array = str.split(" ");
		System.out.println("String array:");
		for(int i = 0 ;i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}

	void replace () {
		System.out.println("Enter the String:");
		String str = scan.nextLine();
		System.out.println("Enter the String you want to replace:");
		String target = scan.nextLine();
		System.out.println("Enter the String you want to replace with :");
		String replacement = scan.nextLine();
		System.out.println("Replaced String :" + str.replace(target,replacement));
	}
}

public class q3 {

	public static void main(String[] args) {
		int choice;
		functions obj = new functions();
		Scanner scan = new Scanner(System.in);

		System.out.println("OPTIONS:\n1.Basic Operations\n2.concatenate\n3.Substring\n4.String To Array\n5.Replace Character\n0.For Exit");
		do {
			System.out.println("Enter the choice:");
			choice = scan.nextInt();
			switch(choice) {
				case 1:{
					obj.basic();
					break;
				}
				case 2:{
					obj.concatenate();
					break;
				}
				case 3:{
					obj.crop();
					break;
				}
				case 4:{
					obj.split();
					break;
				}
				case 5:{
					obj.replace();
					break;
				}
				case 0:{
					System.out.println("Exiting");
					break;
				}
				default:{
					System.out.println("Invalid Choice");
					break;
				}
			}
		}while(choice != 0);
		scan.close();
	}
}
