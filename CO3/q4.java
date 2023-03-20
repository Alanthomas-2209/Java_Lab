//import java.util.*;
//
//class Publisher {
//    String publisherName;
//    Publisher(String pName){
//        this.publisherName = pName;
//    }
//}
//
//class Book extends Publisher {
//    String bookCategory;
//
//    Book(String pName, String bCategory) {
//        super(pName);
//        this.bookCategory = bCategory;
//    }
//}
//
//class Literature extends Book {
//    String bookName;
//    String Author;
//    int bookPrice;
//    Literature(String pName, String bCategory,String bName, int bPrice,  String bAuthor){
//        super(pName,bCategory);
//        this.bookName = bName;
//        this.bookPrice = bPrice;
//        this.Author = bAuthor;
//    }
//    void display() {
//        System.out.println("Publisher: " + publisherName +" Book category: " +bookCategory + " Name of the  Book: "+this.bookName+" Price: "+this.bookPrice);
//    }
//}
//
//class Fiction extends Book {
//    String bookName;
//    String Author;
//    int bookPrice;
//    Fiction(String pName, String bCategory,String bName, int bPrice, String bAuthor){
//        super(pName,bCategory);
//        this.bookName = bName;
//        this.bookPrice = bPrice;
//        this.Author = bAuthor;
//    }
//
//    void display() {
//        System.out.println("Publisher: " + publisherName +" Book category: " +bookCategory + " Name of the  Book: "+this.bookName+" Price: "+this.bookPrice);
//    }
//}
//
//class method {
//    Scanner scan = new Scanner(System.in);
//    void insert() {
//        System.out.println("Enter the details first book:");
//        String pName = scan.next();
//        String bCategory =  scan.next();
//        String bName = scan.next();
//        int bPrice = scan.nextInt();
//        String bAuthor =scan.next();
//        Fiction book1 = new Fiction(pName, bCategory, bName, bPrice,bAuthor);
//        System.out.println("Enter the details first book:");
//        Literature book2 = new Literature(pName, bCategory, bName, bPrice);
//    }
//}
//public class q4 {
//    public static void main(String[] Args) {
//        method object = new method();
//        System.out.println("Enter the details First book:");
//        object.insert();
//        System.out.println("Enter the details Second book:");
//        object.insert();
//    }
//}
