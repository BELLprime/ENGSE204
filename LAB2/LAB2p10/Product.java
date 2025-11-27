package LAB2.LAB2p10;

public class Product {
    //att
    private String name ;
    private Double price ;

    //construct
    public Product (String name , Double price) {
        this.name = name ;
        this.price = price ;
    }

    public String getName() {
        return this.name ;
    }
    public Double getPrice() {
        return this.price ;
    }

}
