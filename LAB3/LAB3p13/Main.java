package LAB3.LAB3p13;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;
        
        int N = input.nextInt() ;
        input.nextLine() ; //clear nextline
        for (int i = 0 ; i < N ; i ++ ) {
            String mode = input.nextLine() ;
            if ( mode.trim().toUpperCase().equals("SET") )  {               
                int max = input.nextInt() ;
                input.nextLine() ;
                try {
                    LicenseManager.setMax( max ) ;
                } catch (IllegalArgumentException e) {
                    System.out.println( e.getMessage() ) ;
                }                
            } else if ( mode.trim().toUpperCase().equals("CHECKOUT" ) ) {              
                LicenseManager.checkOut() ;

            } else if ( mode.trim().toUpperCase().equals("CHECKIN") )  {
                LicenseManager.checkIn() ; 

            } else if ( mode.trim().toUpperCase().equals("STATUS") )  {               
                LicenseManager.displayStatus() ;
            }
        }
        input.close () ; //close scanner 
    }
}
