package LAB5.LAB5p14;
//Superclass
class Shipping {
    protected String trackingId ;
    protected double baseFee ;
    public Shipping (String trackingId , double baseFee) {
        this.trackingId = trackingId ;
        this.baseFee = baseFee;
    }
    public double calculateTotalFee() {
        return baseFee ;
    }
}
//subclass 1
class StandardShipping extends Shipping {
    public StandardShipping ( String id , double baseFee) {
        super(id, baseFee) ;
    }
    @Override
    public double calculateTotalFee() {
        return this.baseFee * 1.05 ;
    }
}
//subclass 2
class PremiumShipping extends Shipping {
    protected double insuranceFee ;
    public PremiumShipping (String id, double baseFee, double insuranceFee) {
        super(id, baseFee) ;
        this.insuranceFee = insuranceFee ;
    }
    @Override
    public double calculateTotalFee() {
        this.baseFee = super.calculateTotalFee() ;
        return baseFee + insuranceFee ;
    }
}