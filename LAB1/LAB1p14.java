import java.util.Scanner;

public class LAB1p14 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        int Row , Col ;
        int bomb = 0 ;

        // Input
        System.out.print("Enter (rows,columns): ");
        Row = input.nextInt();
        Col = input.nextInt();
        System.out.println("----- MAP " + Row + "x" + Col + " -----" );
        char[][] dashboard =  new char[Row][Col] ;

        // Input MAP and target
        for ( int i = 0 ; i < dashboard.length ; i ++ ) { // rows
            for ( int j = 0 ; j < dashboard[i].length ; j++  ) {  // column
                    dashboard[i][j] = input.next().charAt(0); 
            }
        }  
        System.out.print("Enter target(row , column): ") ; // -----เก็บ target--------
        int TRow = input.nextInt() ;
        int TCol = input.nextInt() ; // --------------------------------------------------------
        
        // Process and Show screen
        boolean Minebomb = false;

        // check, is target over MAP? 
        if (TRow >= 0 && TRow < Row && TCol >= 0 && TCol < Col) {
            if (dashboard[ TRow ][ TCol ] == '*') {
                Minebomb = true ;
            }
        }
        if (Minebomb) {
            System.out.println("Mine");
        } 
        else { //count mine near by.
            bomb = 0;
           /* 
            * * *   1 2 3 
            * x *   4 x 5
            * * *   6 7 8
                          */
            if ( TRow - 1 >= 0 && TCol - 1 >= 0 ) {
                if (dashboard[ TRow - 1 ] [ TCol - 1 ] == '*') bomb++; //บนซ้าย
            }
            if ( TRow - 1 >= 0 && TCol >= 0 && TCol < Col ) {
                if (dashboard[ TRow - 1 ] [ TCol ] == '*') bomb++; //บนกลาง
            }
            if ( TRow - 1 >= 0 && TCol + 1 < Col ) {
                if (dashboard[ TRow - 1 ] [ TCol + 1 ] == '*') bomb++; //บนขวา
            }
            if ( TRow - 1 >= 0 && TCol + 1 < Col ) {
                if (dashboard[ TRow ] [ TCol - 1 ] == '*') bomb++; //ซ้าย
            }
            if ( TRow >= 0 && TRow < Row && TCol + 1 < Col ) {
                if (dashboard[ TRow ] [ TCol + 1 ] == '*') bomb++; //ขวา
            }
            if ( TRow + 1 < Row && TCol - 1 >= 0 ) {
                if (dashboard[ TRow + 1 ] [ TCol - 1 ] == '*') bomb++; //ล่างซ้าย
            }
            if ( TRow + 1 < Row && TCol >= 0 && TCol < Col ) {
                if (dashboard[ TRow + 1] [ TCol ] == '*') bomb++; //ล่างกลาง
            }
            if ( TRow + 1 < Row && TCol + 1 < Col ) {
                if (dashboard[ TRow + 1 ] [ TCol + 1 ] == '*') bomb++; //ล่างขวา
            }
            System.out.println(bomb); 
        }
        

        input.close() ;   
    }
    
}

