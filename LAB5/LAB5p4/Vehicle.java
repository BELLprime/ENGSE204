package LAB5.LAB5p4;
//Superclass
class Vehicle {
    protected String color ;

    public Vehicle (String clor) {
        this.color = color ;
    }
}
//Subclass
class Car extends Vehicle {
    protected int wheels ;
    
    public Car(String color , int wheels ) {
        super(color) ;
        this.wheels = wheels ;
    }

    public void displayDetails() {
        System.out.println("Color:" + this.color + ", Wheels:" + this.wheels ) ;
    }
}
