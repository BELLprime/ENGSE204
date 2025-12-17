package LAB5p15;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //car
        System.out.print("Enter car model:" ) ;
        String carModel = input.nextLine() ;
        System.out.print("Enter Rental rate:" ) ;
        double carRentalRate = input.nextDouble() ;
        input.nextLine() ;
        //motorcycle
        System.out.print("Enter motorcycle model:" ) ;
        String motorcycleModel = input.nextLine() ;
        System.out.print("Enter Rental rate:" ) ;
        double motorcycleRentalRate = input.nextDouble() ;
        input.nextLine() ;
        //create obj
        Car car = new Car(carModel, carRentalRate) ;
        Motorcycle motorcycle = new Motorcycle(motorcycleModel, motorcycleRentalRate) ;
        //arr
        RentalVehicle [] rentalVehicles = {car , motorcycle } ;
        double Total_Rental_Fee = 0.0 ;
        for (RentalVehicle rentalVehicle : rentalVehicles) {
            Total_Rental_Fee += rentalVehicle.calculateFee() ;
        }
        System.out.println( Total_Rental_Fee ) ;

        input.close() ; //close 
    }
}