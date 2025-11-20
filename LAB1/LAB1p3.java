import java.util.Scanner;

public class LAB1p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter number: "); 
        if (input.hasNextInt()) {   // ตรวจสอบว่า input ว่าเป็น int ไหม?
            int x = input.nextInt();

            // Output
            System.out.print("Result: "); 
            // Process:
            if (x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Invalid input,Please enter an integer only.");
        }

        // Close scanner
        input.close();
    }
}