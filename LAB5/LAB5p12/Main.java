package LAB5.LAB5p12;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //BasicService
        System.out.print("Enter name:" ) ;
        String nameB = input.nextLine() ;
        System.out.print("Enter base price:" ) ;
        double basePriceB = input.nextDouble() ;
        input.nextLine() ;
        //PremiumService
        System.out.print("Enter name:" ) ;
        String nameP = input.nextLine() ;
        System.out.print("Enter base price:" ) ;
        double basePriceP = input.nextDouble() ;
        input.nextLine() ;
        System.out.print("Enter premium rate:" ) ;
        double premiumRate = input.nextDouble() ;
        input.nextLine() ;
        //create obj 
        BasicService basicService = new BasicService(nameB, basePriceB) ;
        PremiumService premiumService = new PremiumService(nameP, basePriceP , premiumRate) ;
        //arr
        Service [] services = { basicService, premiumService} ;
        for (Service service : services) {
            System.out.println( service.calculateFinalPrice() ) ;
        }

        input.close() ;
    }
}