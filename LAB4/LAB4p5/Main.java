package LAB4.LAB4p5;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        int R = input.nextInt() ; 
        int G = input.nextInt() ; 
        int B = input.nextInt() ; 
        Color color = new Color(R, G, B) ;
        color.displayRGB();

        input.close() ;
    }
}
