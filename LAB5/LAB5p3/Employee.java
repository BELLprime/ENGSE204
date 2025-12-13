package LAB5.LAB5p3;

class Employee {
    protected double salary ;

    public double calculateBonus () {   
        return salary * 0.1 ;
    }
}

class Manager extends Employee {

    @Override 
    public double calculateBonus () {
        return salary * 0.15 ;
    }
}