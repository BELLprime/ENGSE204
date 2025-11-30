package LAB3.LAB3p11;

class SystemConfig {

    private static SystemConfig instance ;


    private String serverUrl ;
    private int maxConnections ;


    private SystemConfig() {

        this.serverUrl = "default.sever.com" ;
        this.maxConnections = 10 ;

    }

    public static SystemConfig getInstance() {

        if (instance == null ){
            instance = new SystemConfig() ;
        }
        return instance ;

    }

    public String getServerUrl() {

        return this.serverUrl ;
    }

    public void setServerUrl (String url) {

        this.serverUrl = url ;
    }

    public int getMaxConnections() {

        return this.maxConnections ;
    }

    public void setMaxConnections (int count) {

        if (count > 0 ) {
            this.maxConnections = count ;
            System.out.println("Max connections set.") ;
        } 
        else throw new IllegalArgumentException("Invalid count.") ;
    
    }
}
