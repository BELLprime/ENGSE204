package LAB6.LAB6p2;
//interface 
interface IDisplayable  {  //class ใดก้ตามที่ใช้ implement นี้จะต้องทำได้ 2 อย่าง
    void display () ; //ไม่จำเป็นต้องระบุ abstract
    String getDetail () ;
}
class Student implements IDisplayable{
    protected String name ;
    protected String studentId ;
    public Student (String name ,String studentId) {
        setName(name);
        setStudentId(studentId);
    }
    //implement
    @Override
    public void display() {
        System.out.println("---Student Profile---") ;
    }
    @Override
    public String getDetail() {
        return "Name:" + this.name + ",ID:" + this.studentId ;
    }
    //setter
    public void setName (String name ) {
        this.name = name ;
    }
    public void setStudentId (String studentId) {
        this.studentId = studentId ;
    }
}
