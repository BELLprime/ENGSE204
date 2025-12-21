package LAB6.LAB6p5;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input 
        System.out.print("Enter recipients: ") ;
        String recipients = input.nextLine() ;
        System.out.print("Enter message: ") ;
        String message = input.nextLine() ;
        //create obj (LOW-level implement)
        EmailSender emailSender = new EmailSender() ;
        Notifier notifier = new Notifier(emailSender) ; //หรือใช้ new Notifier(new EmailSender() ) ; คือ การ depency injection
        notifier.sendNotification(recipients, message) ;
        input.close();
    }
}

