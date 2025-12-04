package LAB3.LAB3p10;

class SystemLogger {

    private static final int INFO = 1;
    private static final int DEBUG = 2;
    private static final int ERROR = 3;
    private static int currentLogLevel = INFO ;

    private static String getLevelName ( int Level ) {
        if ( Level == INFO ) {
            return "INFO" ;
        }
        else if ( Level == DEBUG ) {
            return "DEBUG" ;
        }
        else if ( Level == ERROR ) {
            return "ERROR" ;
        }
        else {
            return "UNKNOWN" ;
        }
    }

    public static void setLogLevel( int newLevel ) {
        if ( newLevel >= INFO && newLevel <= ERROR ) {
            currentLogLevel = newLevel ;
            System.out.println ("Log level set to " + getLevelName(currentLogLevel) ) ;
        } else {
            throw new IllegalArgumentException("Invalid log level") ;
        }
    }

    public static void log( int messageLevel , String message ) {
        if ( messageLevel >= currentLogLevel ) {
            System.out.println ("[" + getLevelName(messageLevel) + "]: " + message ) ;
        } 
    }

}