package LAB3.LAB3p3;

import java.util.Scanner ;

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;

        String initPass = input.nextLine() ;
        String newPass = input.nextLine() ;

        User user = new User( initPass ) ;

        try {
            user.setPassword( newPass ) ;
            System.out.print( user.getPassword() ) ;
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage()) ;
        }

        input.close () ; 
    }
}
