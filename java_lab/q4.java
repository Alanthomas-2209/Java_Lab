package java_lab;
import java.util.*;

class matrix1 {
	int[][] array1 =null;
	int n;
	void insert() {
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the size of the N*N matrix");
		n = scan.nextInt();
		this.array1 = new int[n][n];
		
		System.out.println("Enter the  array :");
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				this.array1[i][j] = scan.nextInt();
			}
		}
	}
	
	void isSymmetric() {
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				if(this.array1[i][j] != this.array1[j][i]) {
					System.out.println("This is not a sysmmetric matrix ..");
					return;
				}
			}
		}
		System.out.println("This is a symmetric matrix...");
	}
	
	void display(){
		 System.out.println("martix :");
		 for(int i = 0; i<n ;i++) {
			 for(int j = 0; j < n; j++) {
				 System.out.print(this.array1[i][j]+"\t");
			 }
			 System.out.println();
		 }
	 }
}
public class q4 {

	public static void main(String[] args) {
		matrix1 m =new matrix1();
		
		m.insert();
		m.display();
		m.isSymmetric();
		
	}

}
