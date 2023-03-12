package java_lab.CO2;
import java.util.*;
import java.lang.*;

class Employee {
    int eNo;
    String eName;
    int eSalary;

     Employee (int no ,String name, int salary){
        this.eNo = no;
        this.eName = name;
        this.eSalary = salary;
    }

    void show(){
        System.out.println("Employee ID : " + this.eNo +" Name : " + this.eName + " Salary : " + this.eSalary);
    }
}

class Functions {
    Scanner scan = new Scanner(System.in);

    void insert(Employee[] obj){
        for(int i = 0;i < obj.length; i++){
            System.out.println("Enter the Employee ID, NAME ,SALARY  respectively:");
            int id =  scan.nextInt();
            String name = scan.next();
            int salary = scan.nextInt();
            obj[i] = new Employee(id,name,salary);
        }
    }

    void search(Employee[] obj){
        int data;
        System.out.println("Enter the Employee ID :");
        data = scan.nextInt();
        for(int i=0 ; i < obj.length ; i++){
            if(data == obj[i].eNo){
                System.out.println("Employee found on: " +(i+1)+"th position");
                obj[i].show();
                return;
            }
        }
        System.out.println("Employee ID not found:");
    }

    void display(Employee[] obj) {
        for(int k = 0; k < obj.length;k++){
            obj[k].show();
//            System.out.println("Employee ID : " + obj[k].eNo +" Name : " + obj[k].eName + " Salary : " + obj[k].eSalary);
        }
    }
}
public class q4 {
    public static void main(String[] args) {
        Functions object = new Functions();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many Employees:");
        int n = scan.nextInt();

        Employee[] obj = new Employee[n];
        object.insert(obj);
        System.out.println("Display Method:");
        object.display(obj);
        System.out.println("Search Method:");
        object.search(obj);
    }
}
