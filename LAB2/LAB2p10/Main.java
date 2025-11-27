package LAB2.LAB2p10;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in ) ;

        int N = input.nextInt() ;
        ShoppingCart cart = new ShoppingCart() ;
        
        for (int i = 0 ; i < N ; i++) {
            input.nextLine() ; // clear buff
            System.out.print("Name product : ") ;
            String name = input.nextLine() ;
            System.out.print("Price product: ") ;
            Double price = input.nextDouble() ;

            Product p = new Product (name , price) ;//create obj construct
            cart.addProduct( p ) ;
        }
        double result = cart.calculateTotalPrice() ;
        System.out.println("-----display-----") ;
        System.out.println(result) ;
    
        input.close() ;

    }
}

