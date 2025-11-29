package LAB2.LAB2p6;

class BankAccount {
    private String ownerName ;
    private double balance ;


    public BankAccount (String  ownerName , double initialBalance ) {
        this.ownerName = ownerName ;
        this.balance = initialBalance ;
    }

    public void deposit ( double amount ) {
        this.balance += amount ;
    }

    public void displaySummary () {
        System.out.println("Owner: " + this.ownerName ) ;
        System.out.println("Balance: " + this.balance ) ;
    }
}


