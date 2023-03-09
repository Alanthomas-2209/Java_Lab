package java_lab.CO1;
import java.util.*;

import java_lab.CO1.cpu.Processor;

class cpu {
	
	int price ;
	Scanner scan = new Scanner(System.in);
	
	class Processor {
		int no_cores;
		String manufacturer;
		
		static class RAM {
			int memory;
			String manufacturer;
			
			cpu cpuobj = new cpu();
			Processor processor = cpuobj.new Processor();
			
			void insert() {
				System.out.println("Enter the  No of the core and manufacturer of the Processor");
				processor.no_cores = cpuobj.scan.nextInt();
				processor.manufacturer = cpuobj.scan.next();
				System.out.println("Enter the  size and manufacturer of the RAM");
				memory = cpuobj.scan.nextInt();
				manufacturer = cpuobj.scan.next();
				System.out.println("Enter the price of the CPU");
				cpuobj.price = cpuobj.scan.nextInt();
			}
			void display() {
				System.out.println("Processor Manufacturer :" + processor.manufacturer +" Number of  cores :" + processor.no_cores);
				System.out.println("RAM Manufacturer :" + this.manufacturer +" RAM size :" + this.memory);
				System.out.println("Price of the CPU: " + cpuobj.price);
			}
		}
	}
}
public class q5 {

	public static void main(String[] args) {
			cpu.Processor.RAM object = new cpu.Processor.RAM();
			object.insert();
			object.display();
	}

}
