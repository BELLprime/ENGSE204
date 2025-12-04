package LAB3.LAB3p9;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;

        int minLength1 = input.nextInt() ;
        input.nextLine();
        String user1_name = input.nextLine() ;
        String user1_pass = input.nextLine() ;
        String user2_name = input.nextLine() ;
        String user2_pass = input.nextLine() ;
        int minLength2 = input.nextInt() ;
        input.nextLine();
        String user2_newPass = input.nextLine() ;

        //protect error 
        try {
            User.setMinLength( minLength1 ) ;
        } catch ( IllegalArgumentException e ) {
            System.out.println( e.getMessage() ) ;
        }
        //obj
        User user1 = new User( user1_name , user1_pass ) ;
        User user2 = new User( user2_name , user2_pass ) ;
        //protect error
        try {
            User.setMinLength( minLength2 ) ;
        } catch ( IllegalArgumentException e ) {
            System.out.println( e.getMessage() ) ;
        }
        //protect error
        try {
            user2.setPassword( user2_newPass ) ;
        } catch ( IllegalArgumentException e ) {
            System.out.println( e.getMessage() ) ;
        }
        //display
        System.out.println( user1.getPassword() ) ;
        System.out.println( user2.getPassword() ) ;

        input.close () ; 
    }
}
