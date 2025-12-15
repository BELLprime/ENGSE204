package LAB5p15;
//Superclass
class RentalVehicle {
    protected String model;
    protected double rentalRate;
    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }
    public double calculateFee() {
        return rentalRate;
    }
}
//subclass 1
class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }
    @Override
    public double calculateFee() {
        return this.rentalRate + 100.0 ;
    }
}
//subclass 2
class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }
    @Override
    public double calculateFee() {
        return this.rentalRate * 1.10 ;
    }
}