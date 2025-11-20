/* จงเขียนโปรแกรมภาษา Java เพื่อรับค่า หมายเลขเมนู (Menu Number) เป็นจำนวนเต็ม 1 ค่า จากผู้ใช้ โดยมีความหมายดังนี้:

1 = "Americano"
2 = "Latte"
3 = "Espresso"
4 = "Mocha"

หากผู้ใช้ป้อนหมายเลข 1, 2, 3, หรือ 4 ให้แสดงชื่อเมนูที่ตรงกัน หากผู้ใช้ป้อนหมายเลขอื่นนอกเหนือจากนี้ ให้แสดงผลว่า Invalid Menu */

import java.util.Scanner;

public class LAB1p5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Menu;
        
        // Input score 
        System.out.print("1 = \"Americano\"\r\n" + 
                        "2 = \"Latte\"\r\n" + 
                        "3 = \"Espresso\"\r\n" + 
                        "4 = \"Mocha\"\r\n" + 
                        "Enter number menu: ");
        int Number = input.nextInt();

        // Process
        switch (Number) {
            case 1:
                Menu = "Americano";
                break;
            case 2:
                Menu = "Latte";
                break;
            case 3:
                Menu = "Espresso"; 
                break; 
            case 4:
                Menu = "Mocha";
                break;
            default:
                Menu = "Invalid Menu";
        }

        // Output 
         System.out.print("\n");
        System.out.print("Result: " + Menu);
        
        input.close();
    }
}
