package LAB5p8;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //student 
        System.out.print("Enter student name:" ) ;
        String studentName = input.nextLine() ;
        System.out.print("Enter student ID:" ) ;
        int studentID = input.nextInt() ;
        input.nextLine() ;
        //employee
        System.out.print("Enter employee name:" ) ;
        String employeeName = input.nextLine() ;
        System.out.print("Enter salary:" ) ;
        double salary = input.nextDouble() ;
        input.nextLine() ;
        //create obj
        Student student = new Student(studentName, studentID) ;
        Employee employee = new Employee(employeeName, salary) ;
        //array 
        Person [] persons = {student ,employee} ;

        for (Person person : persons) {
            if (person instanceof Employee) {
                Employee em = (Employee) person ; //Downcasting
                em.applyBonus(1000.0) ;
            } 
        }
        for (Person person : persons) {
            System.out.println( person.getStatus() ) ;
        }

        input.close() ;
    }
}