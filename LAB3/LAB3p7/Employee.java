package LAB3.LAB3p7;

class Employee {
    
    private String employeeId ; 
    private String department ;
    //con
    public Employee(String employeeId ,String department ) {
        this.employeeId = employeeId ;
        this.department = department ;  
    }
    //read
    public String getEmployeeeId() {   
        return this.employeeId ;
    }
    //read
    public String getDepartment() {
        return this.department ;
    }
    //set
    public void setDepartment(String newDepartment) {
        if (newDepartment == null || newDepartment.isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        } else {
            this.department = newDepartment ;
        }
    }

}
