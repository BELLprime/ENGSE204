package LAB3.LAB3p5;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {
        Scanner input = new Scanner(System.in) ;

        String connectionString = input.nextLine() ;
        DatabaseConnnection DC = new DatabaseConnnection(connectionString) ;
        //check case 
        try {
            DC.connect() ;
        } catch (IllegalStateException e) {
            System.out.println("\n" + e.getMessage()) ;
        }
        //check case
        try {
            DC.disconnect() ;
        } catch (IllegalStateException e) {
            System.out.println("\n" + e.getMessage()) ;
        }
        //check case
        try {
            DC.disconnect() ;
        } catch (IllegalStateException e) {
            System.out.println("\n" + e.getMessage()) ;
        }
        
        System.out.print( DC.isConnected() ) ;

        input.close () ; 
    }
}

