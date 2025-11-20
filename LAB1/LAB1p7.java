/* จงเขียนโปรแกรมภาษา Java เพื่อรับค่าจำนวนเต็ม N 1 ค่า (ซึ่งหมายถึงจำนวนตัวเลขที่จะรับค่าต่อจากนี้) 
   จากนั้น ให้รับค่าจำนวนเต็มอีก N จำนวน แล้วคำนวณ "ผลรวม" (Sum) ของตัวเลขทั้ง N จำนวนนั้น และแสดงผลลัพธ์ออกทางหน้าจอ*/
import java.util.Scanner;

public class LAB1p7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N , Number  ;
        int Sum = 0 ; 

        // Input score 
        System.out.print("Enter N: "); //จำนวนครั้ง
        N = input.nextInt();

        // Process
        for (int i = 1; i <= N ; i++) {
            System.out.print("Enter Number " + i +": " ); 
            Number = input.nextInt();
            Sum += Number ;
        }

        // Output
        System.out.println("\nResult = " + Sum);

        input.close();
    }
}