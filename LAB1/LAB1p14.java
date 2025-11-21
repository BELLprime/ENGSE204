import java.util.Scanner;

public class LAB1p14 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        int R , C ;
        int count = 0 ;

        // Input
        System.out.print("Enter rows: ");
        R = input.nextInt();
        System.out.print("Enter columns: ");
        C = input.nextInt();
        System.out.println("----- MAP " + R + "x" + C + " -----" );
        char[][] dashboard =  new char[R][C] ;

        // Input MAP and target
        for ( int i = 0 ; i < dashboard.length ; i ++ ) { // rows
            for ( int j = 0 ; j < dashboard[i].length ; j++  ) {  // column
                    dashboard[i][j] = input.next().charAt(0); // .charAt(0) คือ การเอาแค่ช่องแรก hello --> "h"
            }
        }  
        System.out.print("Enter target(row , column): ") ; // -----เก็บ target--------
        int TR = input.nextInt() ;
        int TC = input.nextInt() ; // --------------------------------------------------------
        
        // Process and Show screen
        //-----เจอ mine --------
        boolean isMine = false;

        // check, is target over MAP? 
        if (TR >= 0 && TR < R && TC >= 0 && TC < C) {
            if (dashboard[TR][TC] == '*') {
                isMine = true;
            }
        }

        if (isMine) {
            System.out.println("Mine");
        } else { //count mine near by.
            count = 0;
           /* Index (i)	  DR (row)	   DC (column)	    direction (เทียบกับจุดตรงกลาง) --->   
                0	       -1 (ขึ้น)	   -1 (ซ้าย)	    บนซ้าย                            
                1	       -1 (ขึ้น)	    0 (กลาง)       บนกลาง                           * * *        0 1 2 
                2	       -1 (ขึ้น)	    1 (ขวา)	        บนขวา                           * x *   -->  3 x 4
                3	        0 (กลาง)	 -1 (ซ้าย)	        ซ้าย                            * * *        5 6 7
                4	        0 (กลาง)	  1 (ขวา)           ขวา
                5	        1 (ลง)	     -1 (ซ้าย)	       ล่างซ้าย
                6	        1 (ลง)	      0 (กลาง)	      ล่างกลาง
                7	        1 (ลง)	      1 (ขวา)	      ล่างขวา*/
            int[ ] directROW = {-1 , -1 , -1 ,  0 , 0 ,  1 , 1 , 1 } ;
            int[ ] directCOL = {-1 ,  0 ,  1 , -1 , 1 , -1 , 0 , 1 } ;

            for (int i = 0 ; i < 8 ; i++)  { // chek 8 ทิศรอบตัว
                int nextR = TR + directROW[ i ] ;
                int nextC = TC + directCOL[ i ] ;

                if ( nextR >= 0 && nextR < R && nextC >= 0 && nextC < C ) {
                    if (dashboard[ nextR ] [ nextC ] == '*') {
                        count++;
                    }
                }
            }
            System.out.println("Near bomb :" + count);
        }
        // Close scanner
        input.close() ;
    }
}