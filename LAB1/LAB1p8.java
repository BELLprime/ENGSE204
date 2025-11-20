/*  จงเขียนโปรแกรมภาษา Java เพื่อรับค่าจำนวนเต็ม N 1 ค่า (ซึ่งหมายถึงจำนวนตัวเลขที่จะรับค่าต่อจากนี้) 
    จากนั้น ให้รับค่าจำนวนเต็มอีก N จำนวน และเก็บค่าเหล่านั้นไว้ใน Array เมื่อรับค่าครบแล้ว 
    ให้ค้นหา "ค่าที่มากที่สุด" (Maximum Value) จากตัวเลขทั้งหมดใน Array และแสดงผลเฉพาะค่าที่มากที่สุดนั้นออกทางหน้าจอ */
import java.util.Scanner;

public class LAB1p8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N ;
        int holdMax = -999 ; //ค่าพัก

        // Input score 
        System.out.print("Enter N: "); //จำนวนครั้ง
        N = input.nextInt();
        int[] Array = new int[N];

        // Process
        for (int i = 0; i < N ; i++) {
            System.out.printf("%s %d%s" ,"Enter Number" , i+1 ,": "  ); 
            Array[i] = input.nextInt();
            // check find maximum value
            if (Array[i] > holdMax) {
                holdMax = Array[i] ;
            }
        }

        // Output
        System.out.println("\nThe Maximum Value is : " + holdMax );
        // Close scanner 
        input.close();
    }
}