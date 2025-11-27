package LAB2.LAB2p4;

public class Student {
    
    private String name ; 
    private int midtermScore ;
    private int finalScore ;

    //Constructor 
    public Student(String name ,int midS , int finalS ) {
        this.name = name ;
        this.midtermScore = midS ;
        this.finalScore = finalS ;
    }

    //Instance MET
    public double calculateAverage () {
        double result = (this.midtermScore +  this.finalScore) / (double) 2 ; 
        return result ;
    }

    public void displaySummary () {
        System.out.println("Name: " + this.name) ;
        System.out.println("Average Score: " + calculateAverage () ) ;
        System.out.println("Status: " + ( ( calculateAverage () >= 50.0) ? "Pass" : "Fail")  ) ;
    }
}
