package java_lab.CO4;
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many number want to insert:");
        int n = scan.nextInt();
        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            String value = scan.next();
            arrayList.add(value);
        }

        System.out.println("List: " + arrayList);

        System.out.println("Size: " + arrayList.size());

        System.out.println("Enter the position to fetch the data :");
        int position = scan.nextInt();
        System.out.println("First Element: " + arrayList.get(position));

        System.out.println("Enter specific element to check if the list contains it :");
        String containsElement = scan.next();
        System.out.println("Contains " + containsElement + " : " + arrayList.contains(containsElement));

        System.out.println("Enter an element to remove from list :");
        String removeElement = scan.next();
        arrayList.remove(removeElement);
        System.out.println("List after removal: " + arrayList);

        System.out.println("Check if the list is empty :");
        System.out.println("Is Empty: " + arrayList.isEmpty());

        System.out.println("Sorting the list in ascending order");
        Collections.sort(arrayList);
        System.out.println("Sorted List: " + arrayList);

        System.out.println("Clearing the list : ");
        arrayList.clear();
        System.out.println("List after clearing: " + arrayList);

        System.out.println("Is Empty: " + arrayList.isEmpty());
    }
}
