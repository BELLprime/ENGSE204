package LAB3.LAB3p13;

class LicenseManager {

    private static int maxLicenses = 10 ;
    private static int usedLicenses = 0 ;

    public static void setMax(int max) {

        if ( max < 0 ) {

            throw new IllegalArgumentException("invalid max value") ;
        }
        else if ( max < usedLicenses ) {

            throw new IllegalArgumentException("Cannot Set max lower than current usage.") ;
        } 
        else {
             
            maxLicenses = max ;

            System.out.println("Maxlicense set to " + max + ".") ;
        }

    }

    public static boolean checkOut() {

        if (usedLicenses < maxLicenses) {

            usedLicenses++ ;
            
            System.out.println("Checkout successful.") ;

            return true ;
        }
        else {

            System.out.println("Checkout failed: No license available.") ;

            return false ;
        }
    }

    public static void checkIn() {

        if ( usedLicenses > 0 ) {

            usedLicenses-- ; 

            System.out.println("Check-in successful.") ;
        } 
        else System.out.println("Nothing to check-in.") ;

    }

    public static void displayStatus() {

        System.out.println("Used: " + usedLicenses) ;
        System.out.println("Available: " + (maxLicenses - usedLicenses) ) ;
    }
}
