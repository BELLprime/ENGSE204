package LAB5p4;
//Superclass
class Vehicle {
    protected String color ;

    public Vehicle (String color) {
        this.color = color ;
    }
    //get
    public String getColor () {
        return this.color ;
    }
}
//Subclass
class Car extends Vehicle {
    protected int wheels ;
    
    public Car(String color , int wheels ) {
        super(color) ;
        setWheels(wheels); ;
    }

    public void displayDetails() {
        System.out.println("Color:" + getColor() + ", Wheels:" + getWheels() ) ;
    }
    //setter
    public void setWheels (int wheels) {
        this.wheels = wheels ;
    }
    //getter 
    public int getWheels () {
        return this.wheels ;
    }
}
