package LAB5p5;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Radius of Circle    :" ) ;
        double radius = input.nextDouble() ;
        System.out.print("Enter Width of Rectangle  :" ) ;
        double width = input.nextDouble() ;
        System.out.print("Enter Height of Rectangle :" ) ;
        double height = input.nextDouble() ;
        
        Circle circle = new Circle(null, radius) ;
        Rectangle rectangle = new Rectangle(null, width, height) ;

        Shape [] shape = {circle ,rectangle} ; 

        for (int i = 0 ; i < shape.length ; i ++) {
            System.out.println( shape[i].calculateArea() ) ;
        }

        input.close() ;
    }
}
