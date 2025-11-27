package LAB2.LAB2p6;

import java.util.Scanner; 
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        String owner = input.nextLine() ; 
        double initial = input.nextDouble() ; 
        double deposit = input.nextDouble() ; 

        BankAccount Bank = new BankAccount(owner , initial) ;
        Bank.deposit(deposit) ;
        Bank.displaySummary();

        input.close() ;
    }
}

