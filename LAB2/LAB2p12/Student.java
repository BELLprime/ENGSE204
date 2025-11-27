package LAB2.LAB2p12;

public class Student {
    //att
    private String studentName ;
    private Course enrolledCourse ;

    //con 
    public Student (String studentName , Course enrolled) {
        this.studentName = studentName ;
        this.enrolledCourse = enrolled ;
    }

    //met 
    public void displayEnrollment () {
        System.out.println("Student: " + this.studentName ) ;
        System.out.println("Enrolled in: " + this.enrolledCourse.getCourseInfo() ) ;

    }
}
