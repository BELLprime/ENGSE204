package LAB4.LAB4p10;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;

        try {
            int mode = sc.nextInt() ;
            sc.nextLine() ; //clear buff 
            if (mode == 1) {
                TimePeriod timePeriod = new TimePeriod() ;
                timePeriod.displayPeriod();
            } else if (mode == 2) {
                int startHour = sc.nextInt() ; 
                sc.nextLine() ;
                int endHour = sc.nextInt() ; 
                sc.nextLine() ;
                TimePeriod timePeriod = new TimePeriod(startHour, endHour) ;
                timePeriod.displayPeriod();
            } else { //otherwise
                System.out.println ("Mode must be 1 or 2 only.") ;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()) ;
        } catch (Exception e) {
            System.out.println("Mode must be numberic only(1 or 2).") ;
        } finally {
            sc.close( ) ; //alway close          
        }
    }
}
