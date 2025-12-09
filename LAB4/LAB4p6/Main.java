package LAB4.LAB4p6;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        int x = input.nextInt() ;
        int y = input.nextInt() ;
        int dx = input.nextInt() ;
        int dy = input.nextInt() ;

        Point p1 = new Point(x, y) ;
        Point p2 = p1.move(dx, dy) ;
        Point p3 = p2.move(dx, dy) ;
        p1.displayInfo() ;
        p2.displayInfo() ;
        p3.displayInfo() ;
        input.close() ;
    }
}

