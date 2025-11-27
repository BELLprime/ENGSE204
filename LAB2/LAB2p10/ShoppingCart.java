package LAB2.LAB2p10;

public class ShoppingCart {
    private Product [] items = new Product[10] ;
    private int itemCount = 0;

    //method
    public void addProduct(Product p) {
        this.items [ itemCount ] = p ;
        itemCount ++ ;
    } 
    public double calculateTotalPrice() {
        Double TotalPrice = 0.0 ;

        for (int i = 0 ; i <= itemCount - 1 ; i++  ) {
            TotalPrice += items[i].getPrice() ; 
        }
        return TotalPrice ;
    }
}

