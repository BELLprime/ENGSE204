package LAB6.LAB6p2;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input
        System.out.print("Enter Name:") ;
        String name = input.nextLine() ;
        System.out.print("Enter ID:") ;
        String studentId = input.nextLine() ;
        //create obj
        Student student = new Student(name, studentId) ;
        student.display() ;
        System.out.println(student.getDetail() ) ;
        input.close();
    }
}
