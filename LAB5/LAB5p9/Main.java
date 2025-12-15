package LAB5p9;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input Physical product 
        System.out.print("Enter Product name:" ) ;
        String PhyName = input.nextLine() ;
        System.out.print("Enter Unit price:" ) ;
        double unitPrice = input.nextDouble() ;
        input.nextLine() ;
        System.out.print("Enter quantity:" ) ;
        int quantity = input.nextInt() ;
        input.nextLine() ;
        //input DigitalSubscription
        System.out.print("Enter DigitalSubscription:" ) ;
        String digitName = input.nextLine() ;
        System.out.print("Enter Monthly cost:" ) ;
        double monthlyCost = input.nextDouble() ;
        input.nextLine() ;
        System.out.print("Enter months:" ) ;
        int months = input.nextInt() ;
        input.nextLine() ;
        //create obj
        PhysicalProduct physicalProduct = new PhysicalProduct(PhyName, unitPrice, quantity) ;
        DigitalSubscription digitalSubscription = new DigitalSubscription(digitName, monthlyCost, months) ;
        //array
        Item [] items = {physicalProduct,digitalSubscription} ;
        double result = 0 ;
        for (Item item : items) {
            result += item.getValue() ;
        }
        System.out.println("Result:" + result);
        input.close() ;
    }
}