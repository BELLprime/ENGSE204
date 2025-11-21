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
        int Rtarget = input.nextInt() ;
        int Ctarget = input.nextInt() ; // --------------------------------------------------------
        
        boolean isFound = false ;

        for (int i = 0; i < dashboard.length; i++) {
            for (int j = 0; j < dashboard[i].length ; j++) {
                if (Rtarget == i && Ctarget == j && dashboard[i][j] == '*') {
                    isFound = true ;
                    System.out.println("Mine!");

                }
            }
        }

        if (!isFound) {
            if ( Rtarget >= 1 && Ctarget >= 1 ) {
                for (int i = Rtarget - 1; i < R; i++) {
                    for (int j = Ctarget - 1; j < C; j++) {
                        if (dashboard[i][j] == '*') {
                            count++;
                        } 
                    }
                }
            } else if ( Rtarget == 0 && Ctarget >= 1 ) {
                for (int i = Rtarget; i < R; i++) {
                    for (int j = Ctarget - 1; j < C; j++) {
                        if (dashboard[i][j] == '*') {
                            count++;
                        }
                    }
                }
            } else if ( Rtarget >= 1 && Ctarget == 0 ) {
                for (int i = Rtarget - 1; i < R; i++) {
                    for (int j = Ctarget; j < C; j++) {
                        if (dashboard[i][j] == '*') {
                            count++;
                        }
                    }
                }
            } else if (Rtarget == 0 && Ctarget == 0) {
                for (int i = Rtarget; i < R; i++) {
                    for (int j = Ctarget; j < C; j++) {
                        if (dashboard[i][j] == '*') {
                            count++;
                        }
                    }
                }
            }
            System.out.println("Near bomb :" + count);
        }
        // Close scanner
        input.close() ;
    }
}