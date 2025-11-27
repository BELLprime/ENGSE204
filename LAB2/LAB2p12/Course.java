package LAB2.LAB2p12;

public class Course {
    //att 
    private String courseId ;
    private String courseName ;

    //construct
    public Course (String courseid ,String coursename ) {
        this.courseId = courseid ;
        this.courseName = coursename ;
    }  

    //met 
    public String getCourseInfo () {
        return this.courseId + ": " + this.courseName ;
    }

}
