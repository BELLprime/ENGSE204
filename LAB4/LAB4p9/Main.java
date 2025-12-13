package LAB4.LAB4p9;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;
        //input
        try {
            String ID = sc.nextLine() ;
            double initBalance = sc.nextDouble() ;
            double deposit = sc.nextDouble() ;
            double withdraw = sc.nextDouble() ;
            //create obj 
            ImmutableAccount acc1 = new ImmutableAccount(ID, initBalance) ;
            ImmutableAccount acc2 = acc1.deposit(deposit) ;
            ImmutableAccount acc3 = acc2.withdraw(withdraw) ;
            //display
            acc1.displayInfo() ;
            acc3.displayInfo() ;
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage() ) ;
        } 
        sc.close() ;
    }
}
