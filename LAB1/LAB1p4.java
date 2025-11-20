/* จงเขียนโปรแกรมภาษา Java เพื่อรับค่า คะแนนสอบ (Score) ซึ่งเป็นเลขจำนวนเต็ม 1 ค่า (0-100) จากนั้นให้คำนวณเกรดตามเงื่อนไขดังต่อไปนี้:

คะแนน 80 - 100 ได้เกรด A
คะแนน 70 - 79 ได้เกรด B
คะแนน 60 - 69 ได้เกรด C
คะแนน 50 - 59 ได้เกรด D
คะแนน 0 - 49 ได้เกรด F  */

import java.util.Scanner;

public class LAB1p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade;
        
        // Input score 
        System.out.print("Enter score: ");
        int score = input.nextInt();

        // Process
        if (score >= 80) { // (score 80 - 100)
            grade = "A";
        } 
        else if (score >= 70 && score < 80 ) {// (score 70 - 79)
            grade = "B";
        }
        else if (score >= 60 && score < 70 ) {// (score 60 - 69)
            grade  = "C"; 
        }
        else if (score >= 50 && score < 60) {// (score 50 - 59)
            grade  = "D"; 
        }
        else {
            grade  = "F";  // (score 0 - 49)
        }

        // Output 
        System.out.print("Grade: " + grade);

        // Close scanner
        input.close();
    }
}
