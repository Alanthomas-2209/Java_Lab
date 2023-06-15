//package java_lab.CO4;
//
//import java.util.ArrayList;
//
//class genericArray<T> {
//    ArrayList<T> array;
//    genericArray(int size) {
//        this.array = new ArrayList<T>();
//    }
//
//    public  <T extends Comparable<T>>void sort(){
//        if(array.isEmpty()){
//            System.out.println("Nothing to sort...! Please add Anything");
//        }
//        else {
//            for(int i = 0; i < array.size()- 1; i++) {
//                for(int j = 1; j < array.size() - i - 1; j++) {
//                    if(array.get(i).compareTo(array.get(j))){}
//                }
//            }
//        }
//    }
//
//    void display(){
//        if(array.isEmpty()){
//            System.out.println("Array is Empty..!");
//        }
//        else{
//            for(int i = 0 ; i < array.size(); i++){
//                System.out.println( array.get(i) + "->");
//            }
//        }
//    }
//}
//
//
//public class Question9 {
//    public static void main(String[] Args){
//
//    }
//}
