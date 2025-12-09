package LAB4.LAB4p2;

import java.util.Scanner ;

public class Main {
    public static void main (String [ ] args ) {
        Scanner input = new Scanner(System.in) ;

        String name ;
        double price ;
        Product product ;

        try {
            int mode = input.nextInt() ;
            input.nextLine() ; //clear buff 
            if (mode == 1) {
                name = input.nextLine() ;
                product = new Product ( name ) ;
                product.displayInfo () ;
            } else if (mode == 2) {
                name = input.nextLine() ;
                price = input.nextDouble() ;
                product = new Product ( name, price) ;
                product.displayInfo () ;
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
