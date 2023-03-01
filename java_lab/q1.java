package java_lab;
import java.util.*;

class  product {
	int pcode;
	String pname;
	int price;
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
		
		System.out.println("Enter the product code for first object:");
		obj1.pcode = scan.nextInt();
		System.out.println("Enter the product name for first object:");
		obj1.pname = scan.next();
		System.out.println("Enter the product price for first object:");
		obj1.price = scan.nextInt();
		
		System.out.println("Enter the product code for second object:");
		obj2.pcode = scan.nextInt();
		System.out.println("Enter the product name for second object:");
		obj2.pname = scan.next();
		System.out.println("Enter the product price for second object:");
		obj2.price = scan.nextInt();
		
		System.out.println("Enter the product code for third object:");
		obj3.pcode =scan.nextInt();
		System.out.println("Enter the product name for third object:");
		obj3.pname = scan.next();
		System.out.println("Enter the product price for third object:");
		obj3.price =scan.nextInt();
		
		
		if(obj1.price < obj2.price && obj1.price < obj2.price ) {
				System.out.println(obj1.pcode + " has the lowest pricet");
		}
		else if(obj2.price < obj3.price && obj2.price < obj1.price) {
			System.out.println(obj2.pcode + " has the lowest price");
		}
		else {
			System.out.println(obj3.pcode + " has the lowest price");
		}
	}

}
