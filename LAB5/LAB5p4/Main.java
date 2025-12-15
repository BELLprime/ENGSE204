package LAB5p4;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Color:" ) ;
        String color = input.nextLine() ;
        System.out.print("Enter Wheels:" ) ;
        int wheels = input.nextInt() ;

        Car car = new Car(color, wheels) ;
        car.displayDetails() ;

        input.close() ;
    }
}
