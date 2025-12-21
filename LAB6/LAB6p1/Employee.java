package LAB6.LAB6p1;
//abstract class
abstract class Employee { 
    protected String name ;
    public Employee (String name ) {
        setName(name) ;
    }
    public void displayInfo() {
        System.out.println("Employee Name:" + getName() ) ;
    }
    //abstract met
    public abstract double calculatePay() ; //no Body or concrete
    //getter name
    public String getName () {
        return this.name ;
    }
    //setter name
    public void setName (String name) {
       if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        } else {
            this.name = name ;
        }
    }
}
//sub class
class SalaryEmployee extends Employee {
    protected double monthlySalary ;
    public SalaryEmployee(String name , double monthlySalary){
        super(name) ;
        setMonthlySalary(monthlySalary) ; 
    }
    //implement method
    @Override
    public double calculatePay() {
        return monthlySalary ;
    }
    //setter
    public void setMonthlySalary (double monthlySalary) {
        this.monthlySalary = monthlySalary ;
    }
}
