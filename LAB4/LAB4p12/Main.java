package LAB4.LAB4p12;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;
        try {
            String employeeName = sc.nextLine() ;
            int initHour = sc.nextInt() ;
            sc.nextLine() ;
            int newHour = sc.nextInt() ;
            sc.nextLine() ;

            Schedule sch1 = new Schedule(initHour) ;
            EmployeeSchedule emp1 = new EmployeeSchedule(employeeName , sch1) ; //ต้นฉบับ
            EmployeeSchedule emp2 = new EmployeeSchedule(emp1) ;
            sch1.setHour(newHour) ;
            //พิสุูจน์ว่า emp1 เปลี่ยนตาม sch1 แต่ emp2 ไม่เปลี่ยนเพราะถูกทำ deep copy
            emp1.displaySchedule() ; 
            emp2.displaySchedule() ; 
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage()) ;
        } finally {
            sc.close() ;
        }
    }
}
