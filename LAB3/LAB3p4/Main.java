package LAB3.LAB3p4;

import java.util.Scanner ; 

public class Main {
    public static void main( String [ ] args ) {

        Scanner input = new Scanner(System.in) ;

        int N = input.nextInt() ;
        input.nextLine() ;

        Product [] product = new Product [N] ;
        //loop untill N
        for (int i = 0 ; i < N ; i++ ) {
            String nameProduct = input.nextLine() ;
            product [i] = new Product(nameProduct) ;
        }
        //print count of Product
        System.out.print( Product.getProductCount() ) ;

        input.close () ; 
    }
}

