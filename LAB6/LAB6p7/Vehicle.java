package LAB6.LAB6p7;
interface IDrivable {
    void startEngine () ; //interface contract 
}
//Super class
abstract class Vehicle implements IDrivable {//abstract class - state and concrete method 
    protected int currentSpeed ;
    //construct 
    public Vehicle (int currentSpeed ) {
        setCurrentSpeed(currentSpeed) ;
    } 
    //concrete method 
    public void dispolaySpeed () {
        System.out.println("Current Speed: " + this.currentSpeed + " km/h") ;
    }
    //ผลัดภาระimplement ให้ child class 
    public abstract void startEngine() ;
    //setter 
    public void setCurrentSpeed (int currentSpeed) {
        this.currentSpeed = currentSpeed ;
    }
}
//Sub class 
class Truck extends Vehicle {
    protected int cargoWeight ;
    //construct 
    public Truck (int speed , int cargoWeight) {
        super(speed) ;
        setCargoWeight(cargoWeight) ;
    }
    //implement - contact 
    @Override
    public void startEngine () {
        System.out.println("Truck engine started. Max cargo: " + this.cargoWeight + " tons." ) ;
    }
    //setter
    public void setCargoWeight (int cargoWeight) {
        this.cargoWeight = cargoWeight ;
    }
}