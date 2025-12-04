package LAB3.LAB3p8;

import java.util.Scanner ; 
import java.util.ArrayList ;

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;
        //add on
        ArrayList <String> listNotify = new ArrayList <> () ;

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
                    listNotify.add("Stock added.") ;
                } catch ( IllegalArgumentException e ) {
                    System.out.println(  ) ;
                    listNotify.add( e.getMessage() ) ;
                }

            } else if (mode.equals("SELL") ) {

                int amount = input.nextInt() ;
                try {
                    inventoryItem.sellStock(amount) ;
                    listNotify.add( "Sale successful." ) ;
                } catch ( IllegalArgumentException e ) {
                    listNotify.add( e.getMessage() ) ;
                }

            } else {
                System.out.println( "Invalid Mode." ) ;
            }
        } 
        //print ให้ดูสวย แค่ลอง
        for  (int i = 0 ; i < listNotify.size() ; i ++ ) {
            System.out.println( listNotify.get( i ) ) ;
        }
        System.out.println( "Final Stock: " + inventoryItem.getStock() ) ;

        input.close () ; 
    }
}