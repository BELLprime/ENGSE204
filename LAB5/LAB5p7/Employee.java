package LAB5.LAB5p7;
//Superclass
class Employee {
    protected String name ;
    protected double baseSalary ;
    //construct
    public Employee(String name ,double baseSalary) {
        this.name = name ;
        this.baseSalary =baseSalary ;
    }
    public double calculatePay() {
        return baseSalary ;
    }
}
//subclass 1
class SalesEmployee extends Employee {
    protected double commissionRate ;
    //method
    public SalesEmployee (String name ,double baseSalary ,double commissionRate) {
        super(name, baseSalary) ;//con
        this.commissionRate = commissionRate ;
    }
    @Override // overriding 
    public double calculatePay () {
        return this.baseSalary + (this.baseSalary * this.commissionRate) ;
    }
}
//subclass 2
class Manager extends Employee {
    protected double fixedBonus ;
     
    public Manager(String name ,double baseSalary ,double fixedBonus ) {
       super(name, baseSalary) ; //construct
       this.fixedBonus = fixedBonus ;
    }
    @Override 
    public double calculatePay() {
        return this.baseSalary + this.fixedBonus  ;
    }
}
//utility class
class PayrollProcessor {
    public static void process(Employee e ) {
        System.out.println( e.name + " total pay:" + e.calculatePay() ) ;
    } 
} 