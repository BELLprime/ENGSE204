package LAB2.LAB2p11;

public class Car {
    //att
    private String model ;
    private int year ;
    
    //con 
    public Car (String model , int year) {
        this.model = model ;
        this.year = year ;
    }

    //met
    public String getModel () {
        return this.model ;
    } 
    public int getYear () {
        return this.year ;
    } 

    public void setYear (int newYear) { //update val
        this.year = newYear ;
    } 

}
