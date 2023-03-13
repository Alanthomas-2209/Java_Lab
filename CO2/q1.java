package java_lab.CO2;

import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;

class sort {
	String[] array;
	int n;
	Scanner scan = new Scanner(System.in);

	 void insert() {    	
	    	System.out.println("Enter the length of the array:");
	    	n = scan.nextInt();
	    	array =  new String[n];
	    	System.out.println("Enter the data into array:");
	    	for(int i = 0 ; i < n ; i++) {
	    			array[i] = scan.next();
	        	}
	    }
	
	void sorting() {
		Arrays.sort(array);
	}
	
	void display() {
		System.out.println("String array:");
		for(int i = 0;i < n ;i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}

public class q1 {
	
	public static void main(String[] args) {
		sort obj = new sort();
		obj.insert();
		obj.sorting();
		obj.display();
	}

}
