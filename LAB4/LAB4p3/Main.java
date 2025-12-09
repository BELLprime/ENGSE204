package LAB4.LAB4p3;

import java.util.Scanner ;

public class Main {
    public static void main (String [ ] args ) {
        Scanner input = new Scanner(System.in) ;

        String username ;
        int level ;
        Player player ;

        try {
            int mode = input.nextInt() ;
            input.nextLine() ; //clear buff 
            if (mode == 1) {
                player = new Player () ;
                player.displayProfile();
            } else if (mode == 2) {
                username = input.nextLine() ;
                level = input.nextInt() ;
                input.nextLine() ; //clear buff
                player = new Player ( username, level ) ;
                player.displayProfile () ;
            } else { //otherwise
                System.out.println ("Mode must be 1 or 2 only.") ;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()) ;
        } catch (Exception e) {
            System.out.println("Mode must be number only(1 or 2).") ;
        } finally {
            input.close( ) ; //alway close 
        }
    }
}
