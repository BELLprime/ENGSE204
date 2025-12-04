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

            int amount = input.nextInt() ;
            processCommand( inventoryItem , mode , amount ) ;
             
        } 
        System.out.println( "Final Stock: " + inventoryItem.getStock() ) ;
        input.close () ; 
        //end main program
    }
    //funtion
    private static void processCommand(InventoryItem item, String mode, int amount) {
        try {
            switch (mode) {
                case "ADD":
                    item.addStock( amount ) ;
                    break;
                case "SELL":
                    item.sellStock( amount ) ;
                    break;
                default:
                    System.out.println("Invalid Mode.");
            }
        } catch (IllegalArgumentException e ) {
            System.out.println( e.getMessage() ) ;
        }
    }
}