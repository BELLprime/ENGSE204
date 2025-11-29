package LAB3.LAB3p2;

import java.util.Scanner ;

public class Main {
    public static void main(String [ ] args) {
        
        Scanner input = new Scanner(System.in) ;

        int initSocre = input.nextInt() ;

        int newSocre = input.nextInt() ;

        Player saveScore = new Player( initSocre )  ;

        saveScore.setScore( newSocre ) ;

        System.out.println( "\n" + saveScore.getScore() ) ;

        input.close() ;

    }
}
