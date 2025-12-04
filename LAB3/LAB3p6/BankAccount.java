package LAB3.LAB3p6;

class BankAccount {
    private double balance ;
    //construct
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance ;
        } else {
            this.balance = 0.0 ;
        }
    }
    //read get
    public double getBalance() {
        return this.balance ;
    }

    public void deposit (double amount) {
        if (amount > 0 ) {
            this.balance += amount ;
            System.out.println("Deposite successful.") ;
        } 
        else {
            throw new IllegalArgumentException("Invalid deposite amount.") ;
        }

    }

    public void withdraw (double amount) {

        if (amount > 0 && amount <= this.balance ) {
            this.balance -= amount ;
            System.out.println("Withdrawal successful.") ;
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient funds.") ;
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount.") ;
        }

    }
}
