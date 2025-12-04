package LAB3.LAB3p14;

import java.util.Scanner ; 
public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;
        BankAccount myAccount = null ;

        int N = input.nextInt() ;
        input.nextLine() ;

        for ( int i = 0 ; i < N ; i++ ) {
            String mode = input.nextLine() ;

            if ( mode.trim().toUpperCase().equals("CREATE") )  {
                double initialBalance = input.nextDouble() ;
                input.nextLine() ;
                myAccount = new BankAccount( initialBalance ) ;
            } else if ( mode.trim().toUpperCase().equals("DEPOSIT") || mode.trim().toUpperCase().equals("WITHDRAW")) {
                double amount = input.nextDouble() ;
                input.nextLine() ;
                //protect error
                if ( myAccount == null )  {
                    System.out.println("No account exists.") ;
                } else {
                    if ( mode.trim().toUpperCase().equals("DEPOSIT") ){
                        try {
                            myAccount.deposit( amount ) ;
                        } catch (IllegalArgumentException e ) {
                            System.out.println( e.getMessage() ) ;
                        }
                    } 
                    else if ( mode.trim().toUpperCase().equals("WITHDRAW") ) {
                        try {
                            myAccount.withdraw( amount ) ;
                        } catch (IllegalArgumentException e) {
                            System.out.println( e.getMessage() ) ;
                        }
                    }
                }
            } else if ( mode.trim().toUpperCase().equals("STATUS") )  {
                if ( myAccount != null )  {
                    System.out.println("Balance: " + myAccount.getBalance() ) ;
                } else {
                    System.out.println("No account exists." ) ;
                }
            } else if ( mode.trim().toUpperCase().equals("GLOBAL_STATUS") )  {              
                System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount() ) ;
            }
        }
        input.close () ; //close scanner
    }
}

