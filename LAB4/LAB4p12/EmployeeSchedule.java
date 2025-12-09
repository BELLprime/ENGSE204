package LAB4.LAB4p12;

class EmployeeSchedule {
    private String name ; //copy name โดย shallow copy
    private Schedule schedule ;
    //main con  -- regular construct 
    public EmployeeSchedule (String name ,Schedule schedule) {
        this.name = name ;
        this.schedule = schedule ;
    }
    //copy con
    public EmployeeSchedule (EmployeeSchedule other) {
        this.name = other.name ; //copy name โดย shallow copy
        this.schedule = new Schedule(other.schedule.getHour() ) ; //deep copy
    }

    public void displaySchedule () {
        System.out.println(this.name + ":" + schedule.getHour() + ":00") ;
    }
}
