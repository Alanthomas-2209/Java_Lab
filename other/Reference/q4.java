package other.Reference;
import java.util.Scanner;

class CPU {
    int price;
    Scanner scan = new Scanner(System.in);

    class Processor {
        int no_cores;
        String manufacturer;

        static class RAM {
            int memory;
            String manufacturer;

            void insert() {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the size and manufacturer of the RAM");
                memory = scan.nextInt();
                manufacturer = scan.next();
            }

            void display(CPU cpu, Processor processor) {
                System.out.println("Processor Manufacturer: " + processor.manufacturer + " Number of cores: " + processor.no_cores);
                System.out.println("RAM Manufacturer: " + manufacturer + " RAM size: " + memory);
                System.out.println("Price of the CPU: " + cpu.price);
            }
        }

        void insert() {
            System.out.println("Enter the number of cores and manufacturer of the Processor");
            no_cores = scan.nextInt();
            manufacturer = scan.next();
            System.out.println("Enter the price of the CPU");
            price = scan.nextInt();
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.Processor.RAM ram = new CPU.Processor.RAM();
        processor.insert();
        ram.insert();
        ram.display(cpu, processor);
    }
}

