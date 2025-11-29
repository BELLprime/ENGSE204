package LAB3.LAB3p6;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;

        double initBalance = input.nextDouble() ;
        double deposit = input.nextDouble() ;
        double withdraw = input.nextDouble() ;

        input.nextLine() ;

        BankAccount bank = new BankAccount(initBalance) ;

        try {
            bank.deposit(deposit) ;
        } catch (IllegalArgumentException e){
            System.out.println( e.getMessage() ) ;
        }

        try {
            bank.withdraw(withdraw) ;
        } catch (IllegalArgumentException e){
            System.out.println( e.getMessage() ) ;
        }

        System.out.println( "Final Balance: " + bank.getBalance() ) ;

        input.close () ; 
    }
}

