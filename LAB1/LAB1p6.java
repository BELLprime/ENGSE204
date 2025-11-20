/*จงเขียนโปรแกรมภาษา Java เพื่อรับค่าจำนวนเต็ม 1 จำนวน (แม่สูตรคูณ) จากผู้ใช้ จากนั้นให้แสดงผลลัพธ์ของสูตรคูณแม่นั้น ตั้งแต่ 1 ถึง 12 โดยแสดงผลลัพธ์ในรูปแบบ [แม่สูตรคูณ] x [ตัวคูณ] = [ผลลัพธ์] */
import java.util.Scanner;

public class LAB1p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input score 
        System.out.print("Enter number table: ");
        int Number = input.nextInt();

        // Process
        for (int i = 1; i <= 12 ; i++) {
           System.out.printf("%d x %d = %d\n" , Number , i , Number * i );
        }

        input.close();
    }
}