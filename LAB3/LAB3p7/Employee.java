package LAB3.LAB3p7;

public class Employee {
    
    private String employeeId ; 
    private String department ;

    public Employee(String employeeId ,String department ) {

        this.employeeId = employeeId ;
        this.department = department ;
        
    }

    public String getEmployeeeId() {
        
        return this.employeeId ;

    }

    public String getDepartment() {
        
        return this.department ;
        
    }

    public void setDepartment(String newDepartment) {
       
        this.department = newDepartment ;
        
    }

}
