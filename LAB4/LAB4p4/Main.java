package LAB4.LAB4p4;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        double latiude = input.nextDouble() ;
        double longtitude = input.nextDouble() ;
        double newLatiude = input.nextDouble() ;

        Location loc1 = new Location(latiude, longtitude) ; //regular con
        Location loc2 = new Location(loc1) ;    //copy con
        loc1.setLatitude(newLatiude) ;

        loc1.displayInfo() ;
        loc2.displayInfo() ;

        input.close() ;
    }
}
