package LAB3.LAB3p8;

import java.util.Scanner ; 
import java.util.ArrayList ;

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;
        String productName = input.nextLine() ;
        int initStock = input.nextInt() ;
        //obj
        InventoryItem inventoryItem = new InventoryItem(productName , initStock) ;
        
        int N = input.nextInt() ;

        for (int i = 0 ; i < N ; i++) {

            input.nextLine() ;
            String mode = input.nextLine().trim() ;

            if (mode.equals("ADD") ) {

                int amount = input.nextInt() ;
                try {
                    inventoryItem.addStock(amount) ;
                } catch ( IllegalArgumentException e ) {
                    System.out.println( e.getMessage() ) ;
                }

            } else if (mode.equals("SELL") ) {

                int amount = input.nextInt() ;
                try {
                    inventoryItem.sellStock(amount) ;
                } catch ( IllegalArgumentException e ) {
                    System.out.println( e.getMessage() ) ;
                }
            } 
            else {
                System.out.println( "Invalid Mode." ) ;
            }
        } 
        System.out.println( "Final Stock: " + inventoryItem.getStock() ) ;

        input.close () ; 
    }
}