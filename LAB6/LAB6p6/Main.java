package LAB6.LAB6p6;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input 
        System.out.print("Email recipients: ") ;
        String recipients1 = input.nextLine() ;
        System.out.print("Email message: ") ;
        String message1 = input.nextLine() ;
        System.out.print("SMS recipients: ") ;
        String recipients2 = input.nextLine() ;
        System.out.print("SMS message: ") ;
        String message2 = input.nextLine() ;
        //create obj
        EmailSender emailSender = new EmailSender() ;
        SMSSender SMSSender = new SMSSender() ;
        //inject 
        Notifier notifier1 = new Notifier(emailSender) ;
        notifier1.sendNotification(recipients1, message1) ;
        Notifier notifier2 = new Notifier(SMSSender) ;
        notifier2.sendNotification(recipients2, message2) ;
        input.close();
    }
}

