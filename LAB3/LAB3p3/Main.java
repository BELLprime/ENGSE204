package LAB3.LAB3p3;

import java.util.Scanner ;

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;

        String initPass = input.nextLine() ;
        String newPass = input.nextLine() ;
        //obj
        User user = new User( initPass ) ;
        // check
        try {
            user.setPassword( newPass ) ;
            System.out.print( user.getPassword() ) ;
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage()) ;
            System.out.println( initPass ) ;
        }

        input.close () ; 
    }
}
