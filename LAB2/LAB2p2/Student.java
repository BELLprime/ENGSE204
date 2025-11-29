package LAB2.LAB2p2;

class Student {
    //Attribute 
    private String studentId ;
    private String name ;

    //Constructor 
    public Student(String id , String name) {
        this.studentId = id ;
        this.name = name ;
    }

    public void displayinfo () {
        System.out.println(this.studentId) ;
        System.out.println(this.name) ;
    }
    
}

