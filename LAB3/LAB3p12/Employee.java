package LAB3.LAB3p12;

class Employee {

    private String name ;
    private double monthlySalary ;

    public Employee (String name, double monthlySalary) {
        this.name = name ;
        if (monthlySalary > 0 ) {
            this.monthlySalary = monthlySalary ;
        } 
        else {
            this.monthlySalary = 0.0 ;
        }
    }

    public String getName() {
        return this.name ;
    }

    public void giveRaise (double amount) {
        if ( amount > 0 ) {
            this.monthlySalary += amount ;
            System.out.println( "Raise applied.") ;
        } else {
            throw new IllegalArgumentException( "Invalid amount.") ;
        }
    }

    private double getAnnualSalary() {
        return this.monthlySalary * 12 ;
    }

    public double calculateTax(double taxRate) {   
        return getAnnualSalary() * taxRate ;
    }
}
