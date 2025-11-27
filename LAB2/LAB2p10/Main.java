package LAB2.LAB2p10;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in ) ;

        int N = input.nextInt() ;
        ShoppingCart cart = new ShoppingCart() ;
        
        for (int i = 0 ; i < N ; i++) {
            input.nextLine() ; 
        
            String name = input.nextLine() ;
            Double price = input.nextDouble() ;

            Product p = new Product (name , price) ;
            cart.addProduct( p ) ;
        }
        double result = cart.calculateTotalPrice() ;

        System.out.println(result) ;
    
        input.close() ;

    }
}

