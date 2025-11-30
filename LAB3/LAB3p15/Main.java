package LAB3.LAB3p15;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;
        
        String username = input.nextLine() ;

        User user = new User( username ) ;

        int N = input.nextInt() ;
        input.nextLine() ;

        for ( int i = 0 ; i < N ; i++ ) {

            String mode = input.nextLine() ;
            if ( mode.trim().toUpperCase().equals("SET_POLICY" ) ) {

                int max = input.nextInt() ;
                input.nextLine () ;

                try {
                    User.setPolicy( max ) ;
                } catch (IllegalArgumentException e) {
                    System.out.println( e.getMessage() ) ;
                }

            } else if ( mode.trim().toUpperCase().equals("LOGIN" ) ) {

                String password = input.nextLine() ;
                user.login(password) ;

            }
        }

        input.close () ; 
    }
}
