package LAB3.LAB3p10;

import java.util.Scanner ; 
public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;

        int N = input.nextInt() ;
        input.nextLine() ;

        for (int i = 0 ; i < N ; i++ ) {
            
            String order = input.nextLine() ;
            if ( order.trim().toUpperCase().equals("SET") ) {
                int logLevel = input.nextInt() ;
                input.nextLine() ;
                //protect error
                try {
                    SystemLogger.setLogLevel( logLevel ) ;
                } catch ( IllegalArgumentException e ) {
                    System.out.println( e.getMessage() ) ;
                }
            } 
            else if ( order.trim().toUpperCase().equals("LOG") ) {
                int logLevel = input.nextInt() ;
                input.nextLine() ;

                String message = input.nextLine() ;
                SystemLogger.log(logLevel , message) ;
            }
        }
        input.close () ; 
    }
}
