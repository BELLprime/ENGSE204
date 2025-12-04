package LAB3.LAB3p8;

class InventoryItem {
    
    private String productName ;
    private int stock ;
    ///con
    public InventoryItem(String productName , int initialStock ) {
        this.productName = productName;

        if ( initialStock >= 0 ) this.stock = initialStock ;  
        else this.stock = 0 ;
    }
    //read
    public String getProductName() {
        return this.productName ;
    }
    //read
    public int getStock() {
        return this.stock ;
    }

    public void addStock (int amount ) {
        if (amount > 0) {
            this.stock += amount ;
        } else {
            throw new IllegalArgumentException("Invalid amount.") ;
        }
    }
    
    public void sellStock(int amount ) {    
        if (amount > 0 && amount <= this.stock) {
            this.stock -= amount ;
        } else if (amount > this.stock ) {
            throw new IllegalArgumentException("Not enough stock.") ;
        } else {
            throw new IllegalArgumentException("Invalid amount.") ;
        }
    }

}
