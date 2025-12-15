package LAB5p9;
//Superclass
class Item {
    protected String name ;
    public Item (String name) {
        this.name = name ;
    }
    public double getValue() {
        return 0.0 ;
    }
}
//subclass 1
class PhysicalProduct extends Item {
    protected double unitPrice ;
    protected int quantity ;
    public PhysicalProduct(String name , double unitPrice ,int quantity) {
        super(name) ;
        this.unitPrice = unitPrice ; 
        this.quantity = quantity ;
    }
    @Override 
    public double getValue () {
        return this.unitPrice * this.quantity ;
    }
}
//subclass 2
class DigitalSubscription extends Item {
    protected double monthlyCost ;
    protected int months ;
    public DigitalSubscription(String name ,double monthlyCost ,int months) {
        super(name) ;
        this.monthlyCost = monthlyCost ;
        this.months = months ;
    }
    @Override 
    public double getValue () {
        return this.monthlyCost * this.months ;
    }
}