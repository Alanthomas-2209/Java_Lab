package java_lab;
import java.util.*;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int array1[][] = null;
		
		System.out.println("Enter the size of the N*N matrix");
		int n = scan.nextInt();
		array1 = new int[n][n];
		
		System.out.println("Enter the first array :");
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				array1[i][j] = scan.nextInt();
			}
		}
		
		int array2[][] = null;
		array2 = new int[n][n];
		
		System.out.println("Enter the second array :");
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				array2[i][j] = scan.nextInt();
			}
		}
		
		int array3[][];
		array3 = new int[n][n];
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		System.out.println("SUM of the martix :");
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(array3[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
