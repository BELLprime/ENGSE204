/*  คุณกำลังออกแบบ Dashboard ตรวจสอบสถานะ (Monitoring Dashboard) ของเซิร์ฟเวอร์ใน Data Center ซึ่งถูกจัดเรียงเป็นกริด (Grid) 2 มิติ
    โปรแกรมจะต้องรับข้อมูลสถานะของกริดนี้ โดย 1 หมายถึง "Online" และ 0 หมายถึง "Offline" */
import java.util.Scanner;

public class LAB1p13 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ; 
        int R , C ;
        int count = 0 ;

        //Input
        System.out.print("Enter rows: ");
        R = input.nextInt();
        System.out.print("Enter columns: ");
        C = input.nextInt();
        int[][] dashboard =  new int[R][C] ;

        // Process
        for ( int i = 0 ; i < dashboard.length ; i ++ ) { //rows
            for ( int j = 0 ; j < dashboard[i].length ; j++  ) {  //column
                    dashboard[i][j] = input.nextInt() ;
                    if ( dashboard[i][j] == 1 ) {
                        count ++ ;
                    }
            }
        }

        // Show screen
        System.out.print("\nOnline sever : " + count) ;
        

        // Close scanner 
        input.close() ;
    } 
}

