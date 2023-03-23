import java.util.*;

class Student {
    int rollNo;
    String Name;
    String Department;
    int academicMark;

    Student (int rollno, String name, String department, int aMark) {
        this.rollNo = rollno;
        this.Name = name;
        this.Department = department;
        this.academicMark = aMark;
    }
}

class Sports extends Student {
    String sportsGrade;
    Sports (int rollno, String name, String department, int aMark , String grade) {
        super( rollno, name, department, aMark);
        this.sportsGrade = grade;
    }
}

class Result extends  Sports {
    int Rank;

    Result (int rollno, String name, String department, int mark, String grade , int rank) {
        super( rollno, name , department, mark, grade);
        this.Rank = rank;
    }
    void display() {
        System.out.println("Roll NO: " + rollNo + " Name: " + Name + " Department: " + Department +" Mark: " + academicMark + " Grade: " + sportsGrade +" Rank: " + this.Rank);
    }
}
public class q5 {
    public static void main(String[] args) {
        
    }
}
