package LAB3.LAB3p11;

import java.util.Scanner ; 
public class Main {
    public static void main( String [ ] args ) {
        Scanner input = new Scanner(System.in) ;
        
        int N = input.nextInt() ;
        input.nextLine () ; 

        for (int i = 0 ; i < N ; i++ ) {

            String mode = input.nextLine() ;

            if ( mode.trim().toUpperCase().equals("SET_URL") )  {
                String URL = input.nextLine() ;
                SystemConfig config = SystemConfig.getInstance() ; //use static getInstance 
                //protect error
                try {
                     config.setServerUrl( URL ) ; ;
                } catch (IllegalArgumentException e) {
                    System.out.println( e.getMessage() ) ; 
                }
            } 
            else if ( mode.trim().toUpperCase().equals("SET_MAX" ) ) {
                int Max_Count = input.nextInt() ;
                input.nextLine () ; //clear buff 
                SystemConfig config = SystemConfig.getInstance() ;
                //protect error
                try {
                    config.setMaxConnections( Max_Count ) ;
                } catch (IllegalArgumentException e) {
                    System.out.println( e.getMessage() ) ; 
                }
        
            } else if ( mode.trim().toUpperCase().equals("SHOW") )  {
                SystemConfig config = SystemConfig.getInstance() ;//use static
                System.out.println("URL: " + config.getServerUrl() ) ;
                System.out.println("MAX: " + config.getMaxConnections()) ;
            }
        }
        input.close () ; 
    }
}
