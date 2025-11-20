/*  จงเขียนโปรแกรมภาษา Java เพื่อรับค่าจำนวนเต็ม N 1 ค่า (ซึ่งหมายถึงจำนวนตัวเลขที่จะรับค่าต่อจากนี้)
    จากนั้น ให้รับค่าจำนวนเต็มอีก N จำนวน และเก็บค่าเหล่านั้นไว้ใน Array 
    เมื่อรับค่าครบแล้ว ให้คำนวณ "ค่าเฉลี่ย" (Average) ของตัวเลขทั้งหมดใน Array และแสดงผลลัพธ์เป็นเลขทศนิยม */
import java.util.Scanner;

public class LAB1p9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N ;
        int Sum = 0 ;
        double AVG = 0.0f ;

        // Input score 
        System.out.print("Enter N: "); //จำนวนครั้ง
        N = input.nextInt();
        int[] Array = new int[N];

        // Process
        for (int i = 0; i < N ; i++) {
            System.out.printf("%s %d%s" ,"Enter Number" , i+1 ,": "  ); 
            Array[i] = input.nextInt();
            Sum += Array[i] ;
        }
        // cal
        // (ต้องแปลง sum เป็น double "ก่อน" หาร เพื่อให้ได้ทศนิยม)
        AVG = (double) Sum / Array.length;

        // Output
        System.out.println("\nThe Average is : " + AVG );

        // Close scanner 
        input.close();
    }
}
