package java_lab.CO1;
import java.util.*;

class cpu {
	
	int price ;
//	static RAM ram = new RAM();
	Processor processor = new Processor();
	Scanner scan = new Scanner(System.in);
	
	class Processor {
		int no_cores;
		String manufacturer;
	}
	
	 static class RAM {
		static int memory;
		static String manufacturer;
	}
	
	void insert() {
		
		System.out.println("Enter the  No of the core and manufacturer of the Processor");
		processor.no_cores = scan.nextInt();
		processor.manufacturer = scan.next();
		System.out.println("Enter the  size and manufacturer of the RAM");
		RAM.memory = scan.nextInt();
		RAM.manufacturer = scan.next();
		System.out.println("Enter the price of the CPU");
		this.price = scan.nextInt();
	}
	
	void info() {
		System.out.println("Processor Manufacturer :" + processor.manufacturer +" Number of  cores :" + processor.no_cores);
		System.out.println("RAM Manufacturer :" + RAM.manufacturer +" RAM size :" + RAM.memory);
		System.out.println("Price of the CPU: " + this.price);
	}
}
public class q5 {

	public static void main(String[] args) {
		cpu product = new cpu();
		product.insert();
		product.info();
	}

}
