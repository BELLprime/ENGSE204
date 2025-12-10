package LAB4.LAB4p12;

class Schedule { //Mutable Component
    private int hour ;
    //con
    public Schedule (int hour) {
        this.hour =  hour ;
    }
    public void setHour (int newHour) {
        this.hour = newHour ;
    }
    public int getHour() {
        return hour ;
    }
    //copy con
    public Schedule (Schedule other) {
        if (other == null) {
            throw new IllegalArgumentException("other ScoreBoard cannot be null");
        }
        this.hour = other.hour ;
    }
}
