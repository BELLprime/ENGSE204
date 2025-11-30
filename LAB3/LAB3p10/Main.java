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

                int Log = input.nextInt() ;

                input.nextLine() ;

                try {
                    SystemLogger.setLogLevel( Log ) ;
                } catch ( IllegalArgumentException e ) {
                    System.out.println( e.getMessage() ) ;
                }

            } 
            else if ( order.trim().toUpperCase().equals("LOG") ) {

                int Log = input.nextInt() ;

                input.nextLine() ;

                String message = input.nextLine() ;
                SystemLogger.log(Log, message) ;
            }

        }

        input.close () ; 
    }
}
