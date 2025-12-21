package LAB6.LAB6p7;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input 
        System.out.print("Enter speed : ") ;
        int speed = input.nextInt() ;
        input.nextLine() ;
        System.out.print("Enter cargo weight : ") ;
        int cargoWeight = input.nextInt() ;
        input.nextLine() ;
        //crrate obj 
        Truck truck = new Truck(speed, cargoWeight) ;
        truck.dispolaySpeed() ; //method that extends form (abstact class)
        truck.startEngine() ;
        input.close();
    }
}