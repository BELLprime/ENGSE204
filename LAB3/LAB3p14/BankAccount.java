package LAB3.LAB3p14;

class BankAccount {
 
    private double balance;

    private static int totalTransactionCount = 0;

    public BankAccount (double initialDeposit) {

        if ( initialDeposit >= 0 ) {

            this.balance = initialDeposit ; 

        } else this.balance = 0 ;

        System.out.println("Account created.") ;
    }

    public double getBalance() {
    
        return this.balance ;

    }

    public void deposit (double amount) {

        if ( amount > 0 ) {

            this.balance += amount ;
        
            totalTransactionCount++ ;
        
            System.out.println("Deposit successful.") ;

        } else throw new IllegalArgumentException ("Invalid amount.") ;
    }

    public void withdraw(double amount) {

        if ( amount > 0 && amount <= this.balance ) {

            this.balance -= amount ;

            totalTransactionCount++ ;

            System.out.println("Withdrawal successful.") ;

        } else if (amount > this.balance) {

            throw new IllegalArgumentException ("Insufficient funds.") ;

        } else throw new IllegalArgumentException ("Invalid amount.") ;


    }

    public static int getTotalTransactionCount() {

        return totalTransactionCount ;

    }
}
