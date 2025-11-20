import java.util.Scanner;

/**
 LAB1p1 - โปรแกรมรับค่าจำนวนเต็ม 2 จำนวนจากผู้ใช้
 แล้วคำนวณผลบวกและแสดงผลลัพธ์ออกทางหน้าจอ
 */
public class LAB1p1 {
    public static void main(String[] args) {
        // สร้าง Scanner สำหรับรับค่าจากผู้ใช้
        Scanner input = new Scanner(System.in);

        // รับค่าจำนวนเต็มตัวแรก
        System.out.print("Enter x: ");
        int x = input.nextInt();
        
        // รับค่าจำนวนเต็มตัวที่สอง
        System.out.print("Enter y: ");
        int y = input.nextInt();

        // cal ผลบวก
        int result = x + y;

        // show โดยจัดรูปแบบให้ตรงกับ test case
        System.out.println("Result: " + result);

        // Close Scanner
        input.close();
    }
}
