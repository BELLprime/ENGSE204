package LAB6.LAB6p3;
interface Iterable  {
    double getTaxRate() ;
}
//Super class
abstract class Product implements Iterable {
    protected String name ;
    protected double price ;
    public Product (String name , double price) {
        setName(name) ;
        setPrice(price) ;
    }
    public double calculateBasePrice () { //concrete metod { }
        return this.price ;
    }
    public abstract double calculateFinalPrice () ;  //abstract met 
    //setter 
    public void setName (String name ) {
        this.name = name ;
    }
    public void setPrice (double price ) {
        this.price = price ;
    }
}
//Sub class
class Book extends Product {
    public Book (String name , double price) {
        super(name ,price) ;
    }
    @Override
    public double getTaxRate() {
        return 0.07 ;
    }
    @Override
    public double calculateFinalPrice () {
        return ( calculateBasePrice() + ( calculateBasePrice() * getTaxRate() ) ) ;
    }
}