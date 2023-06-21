package java_lab.CO4;

import java.util.HashSet;
import java.util.Scanner;

class setServices {
    Scanner scan = new Scanner(System.in);
    HashSet<Integer>  insert(){
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Enter the number of Elements :");
        int n = scan.nextInt();
        System.out.println("Enter the Elements :");
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            hashSet.add(value);
        }
        return hashSet;
    }
    void setCompare(HashSet s1 , HashSet s2){
        if (s1.equals(s2)) {
            System.out.println("The two HashSets are equal.");
        } else {
            System.out.println("The two HashSets are not equal.");
        }
    }
}
public class Question16 {
    public static void main(String[] args) {
        setServices services = new setServices();
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        System.out.println("SET : I");
        hashSet1 = services.insert();
        System.out.println("SET : II");
        hashSet2 = services.insert();

        services.setCompare(hashSet1,hashSet2);
    }
}
