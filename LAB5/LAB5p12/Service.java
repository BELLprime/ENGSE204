package LAB5p12;
//Super class
class Service {
    protected String name ;
    protected double basePrice ;
    public Service (String name , double basePrice ) {
        this.name = name ; 
        this.basePrice =basePrice ;
    }
    public double calculateFinalPrice () {
        return basePrice ;
    }
}
//subclass 1
class BasicService extends Service{
    public BasicService(String name ,double basePrice ) {
        super(name, basePrice) ;
    }
    @Override 
    public double calculateFinalPrice () {
        return basePrice * 1.05 ;
    }
}
//subclass 2
class PremiumService extends Service{
    protected double premiumRate ;
    public PremiumService(String name ,double basePrice ,double premiumRate) {
        super(name, basePrice) ;
        this.premiumRate = premiumRate ;
    }
    @Override 
    public double calculateFinalPrice () {
        return basePrice * (1 + premiumRate) ;
    }
}