package LAB2.LAB2p11;

import java.util.Scanner;

public class Main {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in) ; 

        System.out.print("Model name : ") ;
        String model = input.nextLine() ; 
        System.out.print("Production year : ") ;
        int year = input.nextInt() ;
        System.out.print("Update year : ") ;
        int updateYear = input.nextInt() ;

        Car car = new Car(model, year) ;
        car.setYear(updateYear) ;

        System.out.println("-----display-----") ; 
        System.out.println("Model: " + car.getModel() ) ; 
        System.out.println("Year: " + car.getYear() ) ; 

        input.close() ;

    }
}
