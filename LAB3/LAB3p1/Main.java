package LAB3.LAB3p1;

import java.util.Scanner ;

public class Main {
    
    public static void main (String [] args ) {

        Scanner input = new Scanner(System.in) ;

        String user_name = input.nextLine() ;

        User name = new User( user_name ) ;

        System.out.println("\n"+ name.getUsername() ) ;

        input.close( ) ;
    }
}
