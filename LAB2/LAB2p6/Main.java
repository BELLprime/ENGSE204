package LAB2.LAB2p6;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Name : ") ; 
        String owner = input.nextLine() ; 
        System.out.print("Enter initialBalance : ") ; 
        double initial = input.nextDouble() ; 
        System.out.print("Enter Deposit amount : ") ;
        double deposit = input.nextDouble() ; 

        BankAccount Bank = new BankAccount(owner, initial) ;
        Bank.deposit(deposit) ;
        //display
        Bank.displaySummary();

        input.close() ;

    }
}

