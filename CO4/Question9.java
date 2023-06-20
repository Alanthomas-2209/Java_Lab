package java_lab.CO4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GenericArray<T extends Comparable<T>> {
    ArrayList<T> array;
    GenericArray(List<T> list) {
        this.array = new ArrayList<>(list);
    }

    public void sort() {
        if (array.isEmpty()) {
            System.out.println("Nothing to sort...! Please add anything");
        } else {
            int n = array.size();
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array.get(j).compareTo(array.get(j + 1)) > 0) {
                        swap(j, j + 1);
                        swapped = true;
                    }
                }
                if (!swapped) {
                    // If no swaps occurred in the inner loop, the array is already sorted
                    break;
                }
            }
        }
    }

    private void swap(int i, int j) {
        T temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    void display() {
        if (array.isEmpty()) {
            System.out.println("Array is Empty..!");
        } else {
            System.out.println("After sorting:");
            for (int i = 0; i < array.size(); i++) {
                System.out.println("["+(i+1) +"] -> "+array.get(i));
            }
        }
    }
}

public class Question9 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("How many integer to insert :");
        int nInteger = scan.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < nInteger; i++) {
            int value = scan.nextInt();
            numbers.add(value);
        }
        GenericArray<Integer> genericArrayInteger = new GenericArray<>(numbers);
        genericArrayInteger.sort();
        genericArrayInteger.display();

        List<String> strings = new ArrayList<>();
        System.out.println("How many strings to insert :");
        int nString = scan.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < nString; i++) {
            String value = scan.next();
            strings.add(value);
        }
        GenericArray<String> genericArrayString = new GenericArray<>(strings);
        genericArrayString.sort();
        genericArrayString.display();
    }
}

