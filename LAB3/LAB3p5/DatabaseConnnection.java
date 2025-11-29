package LAB3.LAB3p5;

class DatabaseConnnection {

    private String connectionString ;
    private boolean connected ;

    public DatabaseConnnection (String connectioString ) {

        this.connectionString = connectioString ;

        this.connected = false ;

    }

    public boolean isConnected () {

        return this.connected ;

    }

    public void connect () {
        
        if (this.connected == false ) {
            
            this.connected = true ;
            
            System.out.println("Connected to " + this.connectionString ) ;

        } else {

            throw new IllegalStateException("Already connected.") ;
            
        }
    }

    public void disconnect ( ) {

        if (this.connected == true ) {
            
            this.connected = false ;
            
            System.out.print("Disconnected"  ) ;

        } else {

            throw new IllegalStateException("Already disconnected.") ;
            
        }
    }

}
