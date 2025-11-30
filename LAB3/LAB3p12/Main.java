package LAB3.LAB3p12;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;
        
        String name = input.nextLine() ;
        double monthlySalary = input.nextDouble() ;
        double taxRate = input.nextDouble() ;
        double raiseAmount = input.nextDouble() ;

        Employee employee = new Employee( name, monthlySalary ) ;

        System.out.printf( "Tax (Before): %.1f\n" , employee.calculateTax(taxRate) ) ;

        try {
            employee.giveRaise(raiseAmount) ;
        } catch (Exception e) {
            System.out.println( e.getMessage() ) ;
        }
        
        System.out.printf( "Tax (After): %.1f\n" , employee.calculateTax(taxRate) ) ;

        input.close () ; 
    }
}
