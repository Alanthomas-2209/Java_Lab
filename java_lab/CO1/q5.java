package java_lab.CO1;
import java.util.*;

import java_lab.CO1.cpu.Processor;

class cpu {
	
	int price ;
//	static RAM ram = new RAM();
	
	Scanner scan = new Scanner(System.in);
	
	class Processor {
		int no_cores;
		String manufacturer;
		
		static class RAM {
			int memory;
			String manufacturer;
			
			cpu cpuobj = new cpu();
			Processor processor = cpuobj.new Processor();
			
			void info() {
				System.out.println("Processor Manufacturer :" + processor.manufacturer +" Number of  cores :" + processor.no_cores);
				System.out.println("RAM Manufacturer :" + this.manufacturer +" RAM size :" + this.memory);
				System.out.println("Price of the CPU: " + cpuobj.price);
			}
		}
	}
	
	 
	
	void insert() {
		cpu cpuobj = new cpu();
		Processor processor = cpuobj.new Processor();
		Processor.RAM ram = new Processor.RAM();
		
		System.out.println("Enter the  No of the core and manufacturer of the Processor");
		processor.no_cores = scan.nextInt();
		processor.manufacturer = scan.next();
		System.out.println("Enter the  size and manufacturer of the RAM");
		ram.memory = scan.nextInt();
		ram.manufacturer = scan.next();
		System.out.println("Enter the price of the CPU");
		this.price = scan.nextInt();
	}
	void info1() {
		Processor.RAM product = new Processor.RAM();
		product.info();
	}
}
public class q5 {

	public static void main(String[] args) {
		cpu obj = new cpu();
		obj.insert();
		obj.info1();
		
	}

}
