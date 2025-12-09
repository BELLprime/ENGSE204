package LAB4.LAB4p9;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;
        //input
        try {
            String ID = sc.nextLine() ;
            double initBalance = sc.nextDouble() ;
            sc.nextLine () ;
            double deposit = sc.nextDouble() ;
            sc.nextLine () ;
            double withdraw = sc.nextDouble() ;
            sc.nextLine () ;
            //create obj 
            ImnutableAccount acc1 = new ImnutableAccount(ID, initBalance) ;
            ImnutableAccount acc2 = acc1.deposit(deposit) ;
            ImnutableAccount acc3 = acc2.withdraw(withdraw) ;
            //display
            acc1.displayInfo() ;
            acc3.displayInfo() ;
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage() ) ;
        } catch (Exception e) { // ดักทุกอย่าง
            System.out.println("Something went wrong! (Maybe wrong input?).") ;
        } finally {
            sc.close() ;
        }
    }
}
