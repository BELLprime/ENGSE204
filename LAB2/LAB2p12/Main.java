package LAB2.LAB2p12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Course code : ") ;
        String courseId = input.nextLine() ; 
        System.out.print("Course name : ") ;
        String courseName = input.nextLine() ;
        System.out.print("Student name : ") ;
        String studentName = input.nextLine() ;

        Course course = new Course( courseId , courseName ) ;
        Student student = new Student( studentName , course ) ;

        student.displayEnrollment() ;

        input.close() ; 
    }   
}
