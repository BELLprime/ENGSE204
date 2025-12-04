package LAB3.LAB3p7;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;
        //input
        String employeeID = input.nextLine() ;
        String initDepartment = input.nextLine() ;
        String newDepartment = input.nextLine() ;
        //create obj
        Employee employee = new Employee( employeeID , initDepartment ) ;
        //set
        try {
            employee.setDepartment( newDepartment ) ;
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage() ) ;
        }
        //display
        System.out.println("\n" + employee.getEmployeeeId() ) ;
        System.out.println( employee.getDepartment() ) ;

        input.close () ; 
    }
}
