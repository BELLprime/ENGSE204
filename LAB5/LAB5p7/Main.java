package LAB5p7;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //SalesEmployee
        System.out.print("Enter name:" ) ;
        String name1 = input.nextLine() ;
        System.out.print("Enter salary:" ) ;
        double salary1 = input.nextDouble() ;
        input.nextLine() ; //clear buff
        System.out.print("Enter rate:" ) ;
        double rate = input.nextDouble() ;
        input.nextLine() ; //clear buff
        //Manager
        System.out.print("Enter name:" ) ;
        String name2 = input.nextLine() ;
        System.out.print("Enter salary:" ) ;
        double salary2 = input.nextDouble() ;
        input.nextLine() ; //clear buff
        System.out.print("Enter bonus:" ) ;
        double bonus = input.nextDouble() ;
        input.nextLine() ; //clear buff
        //create obj
        SalesEmployee salesEmployee = new SalesEmployee(name1, salary1, rate) ;
        Manager manager = new Manager(name2, salary2, bonus) ;
        //utility 
        PayrollProcessor.process(salesEmployee) ;
        PayrollProcessor.process(manager) ;

        input.close() ;
    }
}