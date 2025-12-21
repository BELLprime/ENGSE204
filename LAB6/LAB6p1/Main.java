package LAB6.LAB6p1;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input
        try {
            System.out.print("Enter Name:") ;
            String name = input.nextLine() ;
            System.out.print("Enter salary:") ;
            double salary = input.nextDouble() ;
            //create obj 
            SalaryEmployee salaryEmployee = new SalaryEmployee(name, salary) ;
            salaryEmployee.displayInfo() ;
            System.out.println(salaryEmployee.calculatePay() ) ;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()) ;
        }
        input.close() ;
    }
}
