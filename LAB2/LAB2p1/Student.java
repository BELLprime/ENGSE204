package LAB2.LAB2p1;

public class Student {
    //Attribute 
    private String studentId ;
    private String name ;

    //Constructor 
    public Student(String id , String name) {
        this.studentId = id ;
        this.name = name ;
    }
    //Instance MET
    public String getID() { 
        return this.studentId ;
    }
    public String getName() { 
        return this.name ;
    }
    
}
