package LAB2.LAB2p5;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Width : ") ; 
        double W = input.nextDouble() ; 
        System.out.print("Enter Height : ") ; 
        double H = input.nextDouble() ; 

        Rectangle Rec = new Rectangle(W, H) ; 
        //display
        System.out.println( Rec.getArea() ) ;
        System.out.println( Rec.getPerimeter ()) ;

        input.close() ;

    }
}

