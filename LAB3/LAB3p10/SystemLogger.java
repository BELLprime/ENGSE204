package LAB3.LAB3p10;

class SystemLogger {
    
    private static int currentLogLevel = 1 ; 

    private static String getLevelName ( int Level ) {
        
        if ( Level == 1 ) return "INFO" ;

        else if ( Level == 2 ) return "DEBUG" ;

        else if ( Level == 3 ) return "ERROR" ;

        else return "UNKNOWN" ;
    }

    public static void setLogLevel( int newLevel ) {

        if ( newLevel >=1 && newLevel <= 3 ) {

            currentLogLevel = newLevel ;
            
            System.out.println ("Log level set to " + getLevelName(currentLogLevel) ) ;

        } else throw new IllegalArgumentException("Invalid log level") ;

    }

    public static void log( int messageLevel , String message ) {

        if ( messageLevel >= currentLogLevel ) {

            System.out.println ("[" + getLevelName(messageLevel) + "]: " + message ) ;

        } 

    }

}
