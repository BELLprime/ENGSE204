package LAB4.LAB4p10;

class TimePeriod {
    private int startHour ;
    private int endHour ;

    public TimePeriod () { //Default con //chaining
       this(9, 17) ;
    }
    public TimePeriod(int startHour , int endHour) { //Main con
        //validation 1 
        //startHour 
        if (startHour < 0) {
            this.startHour = 0 ;
        } else if (startHour > 23) {
            this.startHour = 23 ;
        } else this.startHour = startHour ;
        //endHour
        if (endHour < 0) {
            this.endHour = 0 ;
        } else if (endHour > 23) {
            this.endHour = 23 ;
        } else this.endHour = endHour ;
        //validation 2
        if (this.startHour > this.endHour) {
            int temp = this.startHour ;
            this.startHour = this.endHour ;
            this.endHour = temp ;
        }
    }
    public void displayPeriod() {
        System.out.println( this.startHour + ":00 - " + this.endHour + ":00") ;
    }
}
