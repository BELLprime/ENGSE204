package LAB4.LAB4p13;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;

        int maxDuration = sc.nextInt() ;
        sc.nextLine() ;
        String planName = sc.nextLine() ;
        int durationDays = sc.nextInt() ;
        sc.nextLine() ;
        int newDays1 = sc.nextInt() ;
        sc.nextLine() ;
        int newDays2 = sc.nextInt() ;
        sc.nextLine() ;

        Subscription.setMaxDuration(maxDuration) ;
        Subscription subscription1 = new Subscription(planName, durationDays) ;
        Subscription subscription2 = subscription1.extend(newDays1) ;
        Subscription subscription3 = subscription2.extend(newDays2) ;

        subscription3.displayInfo() ;

        sc.close() ;
    }
}
