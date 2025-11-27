package LAB2.LAB2p3;

public class Student {
    //Ins attribute
    private String studentId ;
    private String name ;

    //Static attribute
    public static int studentCount = 0 ;

    //Constructor 
    public Student(String id , String name) {
        this.studentId = id ;
        this.name = name ;
        studentCount++ ;
    }
    
}