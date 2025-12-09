package LAB4.LAB4p9;

class ImnutableAccount {
    private final String accountId;
    private final double balance ;

    //regular construct
    public ImnutableAccount (String accountId , double balance ) { 
        if (accountId == null || accountId.isEmpty()) {
            throw new IllegalArgumentException("Account can't be null or empty.") ;
        }
        this.accountId = accountId ;

        if (balance < 0 ) {
            this.balance = 0.0 ;
        } else {
            this.balance = balance ;
        }
    }
    //copy construct
    public ImnutableAccount (ImnutableAccount other ) { 
        this.accountId = other.accountId ;
        this.balance = other.balance ;
    }
    ///getter
    public String getAccountId () {
        return this.accountId ;
    }
    public double getBalance () {
        return this.balance ;
    }

    public ImnutableAccount deposit ( double amount ) {//new obj
        if (amount > 0 ) {
            double newBalance = this.balance + amount ;
            return new ImnutableAccount(accountId, newBalance) ;//create new obj
        } else {
            System.out.println("Invalid deposit amount.") ;
            return this ;
        }
    } 
    public ImnutableAccount withdraw ( double amount ) { //new obj
        if (amount > 0 && amount <= this.balance ) {
            double newBalance = this.balance - amount ;
            return new ImnutableAccount(accountId, newBalance) ;//create new obj
        } else if (amount > this.balance ) {
            System.out.println("Insufficirnt fund.") ;
            return this ;
        } else {
            System.out.println("Invalid withdrawal amount.") ;
            return this ;
        }
    } 

    public void displayInfo() {
        System.out.println("ID:" + this.accountId + ",Balance:" + this.balance) ;
    }
}
