package LAB5p10;
//Superclass
class ProjectTask {
    protected String description ;
    protected int baseHours ;
    public ProjectTask (String description , int baseHours) {
        this.description = description ;
        this.baseHours = baseHours ;
    }

    public double calculateCost() {
        return baseHours *  50.0 ;    
    } 
}
//subclass 1
class ComplexTask extends ProjectTask {
    protected double setupFee ;
    public ComplexTask (String description , int baseHours ,double setupFee) {
        super(description, baseHours) ;
        this.setupFee = setupFee ;
    }
    @Override 
    public double calculateCost () {
        return (super.calculateCost() * 1.10) + this.setupFee ; 
    }
}
//subclass 2
class SimpleTask extends ProjectTask {
    public SimpleTask(String description , int baseHours ) {
        super(description, baseHours) ;
    }
    @Override 
    public double calculateCost () {
        return super.calculateCost() ;
    }
    
}