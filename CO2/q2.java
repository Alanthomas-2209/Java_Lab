package java_lab.CO2;
import java.util.*;

class matrix {
    int [] array;
    int n;
    Scanner scan = new Scanner(System.in);
    
    void insert() {    	
    	System.out.println("Enter the length of the array:");
    	n = scan.nextInt();
    	array =  new int[n];
    	System.out.println("Enter the data into array:");
    	for(int i = 0 ; i < n ; i++) {
    			array[i] = scan.nextInt();
        	}
    }
    
    void search(){
    	System.out.println("Enter the data to search:");
    	int data =scan.nextInt();
        for(int i = 0 ; i < n ; i++) {
        	if(data == array[i]) {
        		System.out.println("Item found:" + (i+1) + "th position");
        		return;
        	}
        }
        System.out.println("Item not found...!");
    }
}

public class q2 {

	public static void main(String[] args) {
		matrix M = new matrix();
		
		M.insert();
		M.search();
		M.search();
	}

}
