package LAB2.LAB2p7;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Name : ") ; 
        String owner = input.nextLine() ; 
        System.out.print("Enter initialBalance : ") ; 
        double initial = input.nextDouble() ;  
        System.out.print("Enter Withdraw amount (1): ") ; 
        double withdrawA = input.nextDouble() ; 
        System.out.print("Enter Withdraw amount (2): ") ; 
        double withdrawB = input.nextDouble() ;

        BankAccount Bank = new BankAccount(owner, initial) ;

        //display
        System.out.println("-----display-----") ;
        Bank.withdraw( withdrawA ) ;
        Bank.withdraw( withdrawB ) ;
        Bank.displayBalance() ;
        
        input.close() ;

    }
}