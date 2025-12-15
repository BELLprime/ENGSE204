package LAB5p3;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Salary:" ) ;
        double salary = input.nextDouble() ;
        
        Manager manager = new Manager() ; //create obj
        manager.salary = salary ; // set attribute
        
        System.out.println( "Result:" + manager.calculateBonus() );

        input.close() ;
    }
}