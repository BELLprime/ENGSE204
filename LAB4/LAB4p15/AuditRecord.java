package LAB4.LAB4p15;

class AuditRecord {
    private final String user ;
    private final String [] logMessages ;

    private static int maxMessages = 3 ;
    // construct chaining
    public AuditRecord (String user) {
        this(user, new String[0] ) ;
    }
    //Main construct
    public AuditRecord (String user ,String [] logs ) { 
        int start ,size ;
        this.user = user ;
        
        if (logs.length > maxMessages) {
            start = logs.length - maxMessages ;
            size = maxMessages ;
        } else {
            start = 0 ;
            size = logs.length ;
        }
        //deep copy
        this.logMessages = new String[size] ; //create (obj)array 
        for (int i = 0 ; i < size ; i++ ) {
            this.logMessages[i] = logs[start + i] ;
        } 
    }

    private AuditRecord(String user, String[] logs, boolean isInternal) { //add on
        this.user = user ;
        this.logMessages = logs ; 
    }

    //method
    public static void setPolicy (int max) { //setter
        if (max > 0) {
            maxMessages = max ;
            System.out.println("Policy set to " + max) ;
        } else {
            System.out.println("Invalid policy.") ;
        }
    }

    public AuditRecord addMessage (String message ) { //immutable action
        if (this.logMessages.length <= maxMessages) {
            String [] newArray = new String[this.logMessages.length + 1] ; //เก็บ new log  + ขยาย
            //copy messs
            for (int i = 0 ; i < this.logMessages.length ; i++ ) {
                newArray[i] = this.logMessages[i] ;
            } 
            //add mess
            newArray[newArray.length - 1] = message ;
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newArray ,true) ;

        } else {
            System.out.println("Log is full.") ;
            return this ;
        } 
    }
    public void displayLog() {
        System.out.print("User:" + this.user + ",Logs:" + this.logMessages.length + "[") ;
        for (int i = 0 ; i < this.logMessages.length ; i++ ) {
            System.out.print( this.logMessages[i] ) ;

            if (i < this.logMessages.length - 1) {
                System.out.print(",");
            }
        } 
        System.out.print("]") ;
    }
}   