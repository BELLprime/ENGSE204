package LAB2.LAB2p7;

public class BankAccount {
    private String ownerName ;
    private double balance ;

    //construc
    public BankAccount (String  ownerName , double initialBalance ) {
        this.ownerName = ownerName ;
        this.balance = initialBalance ;
    }

    //met
    public void withdraw (double amount) {
        if (amount <= this.balance){
            this.balance -= amount ;
            System.out.println("Withdrawal successful.");
        }
        else {
            System.out.println("Insufficient funds.");
        }
    }

    //show
    public void displayBalance () {
        System.out.println("Balance: " + this.balance ) ;
    }
}

