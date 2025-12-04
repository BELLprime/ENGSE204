package LAB3.LAB3p5;

class DatabaseConnnection {

    private String connectionString ;
    private boolean connected ;
    //construct
    public DatabaseConnnection (String connectioString ) {
        this.connectionString = connectioString ;
        this.connected = false ;
    }

    public boolean isConnected ( ) {
        return this.connected ;
    }

    public void connect () {    
        if (this.connected == false ) {
            this.connected = true ;
            System.out.println("Connected to " + this.connectionString ) ;
        } else {
            //protect test case
            throw new IllegalStateException("Already connected.") ;  
        }
    }

    public void disconnect ( ) {
        if (this.connected == true ) {
            this.connected = false ;
            System.out.print("Disconnected"  ) ;
        } else {
            //protect test case
            throw new IllegalStateException("Already disconnected.") ;
        }
    }

}
