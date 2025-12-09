package LAB4.LAB4p4;

class Location {
    private double latiude ;
    private double longtitude ;

    public Location (double latiude , double longtitude ) { //regular construct
        this.latiude = latiude ;
        this.longtitude = longtitude ; 
    }

    public Location (Location other ) {
        this.latiude = other.latiude ;
        this.longtitude = other.longtitude ;
    }

    public void setLatitude (double newLat) {
        this.latiude = newLat ;
    }

    public void displayInfo () {
        System.out.println ("Lat:" + this.latiude + ", Lon:" + this.longtitude ) ;
    }
}   
