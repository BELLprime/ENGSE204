package LAB4.LAB4p14;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;
        //input
        int [] originalScore = new int[3] ; //array
        try {
            String gameName = sc.nextLine() ;
            originalScore[0] = sc.nextInt() ;
            originalScore[1] = sc.nextInt() ;
            originalScore[2] = sc.nextInt() ;

            ScoreBoard sb1 = new ScoreBoard(gameName, originalScore) ; //main con  (original)
            ScoreBoard sb2 = new ScoreBoard(sb1) ; //copy con
            originalScore[0] = sc.nextInt() ;
            
            sb1.displayScore() ;  
            sb2.displayScore() ; //copy
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage() ) ;
        } finally {
            sc.close() ;
        }
    }
}
