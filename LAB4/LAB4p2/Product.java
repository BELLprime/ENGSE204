package LAB4.LAB4p2;

class Product {
    private String name ; 
    private double price ; 

    public Product (String name ) {
        this(name, 0.0) ;
    }

    public Product (String name ,double price ) { //master construct 
        if (name == null || name.isEmpty()) { 
            throw new IllegalArgumentException("Product name can't be empty"); 
        }
        this.name = name ; 
        this.price = price ;
    }

    public void displayInfo() {
        System.out.println("Product: " + this.name + ",Price: " + this.price) ;
    }
}
