package LAB5.LAB5p14;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //Standard
        System.out.print("Enter Standard ID:" ) ;
        String standardID = input.nextLine() ;
        System.out.print("Enter Standard BaseFee:" ) ;
        double standardBasefee = input.nextDouble() ;
        input.nextLine() ;
        //Premium
        System.out.print("Enter Premium ID:" ) ;
        String premiumdID = input.nextLine() ;
        System.out.print("Enter Premium BaseFee:" ) ;
        double premiumBasefee = input.nextDouble() ;
        input.nextLine() ;
        System.out.print("Enter InsuranceFee:" ) ;
        double insuranceFee = input.nextDouble() ;
        input.nextLine() ;
        //create obj 
        StandardShipping standardShipping = new StandardShipping( standardID, standardBasefee ) ;
        PremiumShipping premiumShipping = new PremiumShipping( premiumdID, premiumBasefee, insuranceFee ) ;
        //arr
        Shipping [] shippings = {standardShipping , premiumShipping } ;
        for (Shipping shipping : shippings) {
            System.out.println( shipping.calculateTotalFee() ) ;
        }
        input.close() ;
    }
}