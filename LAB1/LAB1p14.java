// NO code form AI 100% code by natthakit
import java.util.Scanner ;

public class LAB1p14 {

    public static void main ( String [ ] args) {

        Scanner input = new Scanner( System.in ) ;

        int Row , Col ;

        int bomb = 0 ;

        System.out.print("MAP: " ); 

        Row = input.nextInt () ;
        Col = input.nextInt () ;

        char[][] MAP =  new char[Row][Col] ;

        
        for ( int i = 0 ; i < MAP.length ; i ++ ) {
            for ( int j = 0 ; j < MAP[i].length ; j++  ) {  
                    MAP[ i ] [ j ] = input.next().charAt(0) ; 
            }
        }  
        System.out.print("Target :") ; 
        int TRow = input.nextInt() ;
        int TCol = input.nextInt() ;
        
        int Minebomb = 0 ;

        if (TRow >= 0 && TRow < Row && TCol >= 0 && TCol < Col) {
            if (MAP[ TRow ][ TCol ] == '*') {
                Minebomb = 1 ;
            }
        }
        if (Minebomb == 1) {
            System.out.println("Mine");
        } 
        else { 
            bomb = 0 ;
            if ( TRow - 1 >= 0 && TCol - 1 >= 0 ) {
                if (MAP[ TRow - 1 ] [ TCol - 1 ] == '*') {
                    bomb++; //above L
                }
            }
            if ( TRow - 1 >= 0 && TCol >= 0 && TCol < Col ) {
                if (MAP[ TRow - 1 ] [ TCol ] == '*') {
                    bomb++; //above M
                }
            }
            if ( TRow - 1 >= 0 && TCol + 1 < Col ) {
                if (MAP[ TRow - 1 ] [ TCol + 1 ] == '*') {
                    bomb++; //above R
                }
            }
            if ( TRow - 1 >= 0 && TCol + 1 < Col ) {
                if (MAP[ TRow ] [ TCol - 1 ] == '*') {
                    bomb++; //L
                }
            }
            if ( TRow >= 0 && TRow < Row && TCol + 1 < Col ) {
                if (MAP[ TRow ] [ TCol + 1 ] == '*') {
                    bomb++; //R
                }
            }
            if ( TRow + 1 < Row && TCol - 1 >= 0 ) {
                if (MAP[ TRow + 1 ] [ TCol - 1 ] == '*') {
                    bomb++; //down L
                }
            }
            if ( TRow + 1 < Row && TCol >= 0 && TCol < Col ) {
                if (MAP[ TRow + 1] [ TCol ] == '*') {
                    bomb++; //down M
                }
            }
            if ( TRow + 1 < Row && TCol + 1 < Col ) {
                if (MAP[ TRow + 1 ] [ TCol + 1 ] == '*') {
                    bomb++; //down R
                }
            }
            System.out.println(bomb); 
        }

        input.close() ;   
    }
    
}

