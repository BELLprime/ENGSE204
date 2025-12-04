package LAB3.LAB3p4;

class Product {

    private String name ;
    private static int productCount = 0 ;
    //construc
    public Product (String name ) {
        this.name = name ; 
        productCount++ ;
    }
    //read
    public static int getProductCount () {
        return productCount ;
    }

}
