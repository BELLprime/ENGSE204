package LAB6.LAB6p8;
//interface - contact 
interface IMaintainable {
    boolean needsMaintenance() ;
}
//Abstact class - state and Common Logic
abstract class PowerGenerator implements IMaintainable {
    protected String name ;
    protected double basePower ;
    protected int usageHours ;
    //con
    public PowerGenerator (String name , double basePower , int usageHours) {
        setName(name) ;
        setBasePower(basePower) ;
        setUsageHours(usageHours) ;
    }
    //concrete method
    public void increaseUsage (int hour) {
        this.usageHours += hour ;
    }
    //abstact method
    public abstract double getEfficiency() ;
    //concrete Logic
    public double calculateOutput() {
        return basePower * getEfficiency() ;
    }  
    //setter
    public void setName (String name ) {
        this.name = name ;
    }
    public void setBasePower (double basePower ) {
        this.basePower = basePower ;
    }
    public void setUsageHours (int usageHours ) {
        this.usageHours = usageHours ;
    }
}
//subclass 
class SolarPanel extends PowerGenerator {
    public SolarPanel(String name ,double basePower , int usageHours) {
        super(name, basePower, usageHours) ;
    }
    //implement ของ abstact method ของ class PowerGenerator
    @Override
    public double getEfficiency() {
        return 0.90 ;
    }
    //implemrnt ของ abstact interface IMaintainable
    @Override 
    public boolean needsMaintenance() {
        if (this.usageHours > 100){
            return true ;
        } else {
            return false ; 
        }
    }
    public double calculateFinalOutput() {
        double basic = super.calculateOutput() ;
        //condition logic 
        if (needsMaintenance()) {
            return basic * 0.5 ;
        } else {
            return basic ;
        }
    }
}