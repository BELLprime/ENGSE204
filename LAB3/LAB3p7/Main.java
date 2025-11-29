package LAB3.LAB3p7;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;

        String employeeID = input.nextLine() ;
        String initDepartment = input.nextLine() ;
        String newDepartment = input.nextLine() ;

        Employee employee = new Employee( employeeID , initDepartment ) ;

        employee.setDepartment( newDepartment ) ;

        System.out.println("\n" + employee.getEmployeeeId() ) ;
        System.out.println( employee.getDepartment() ) ;

        input.close () ; 
    }
}
