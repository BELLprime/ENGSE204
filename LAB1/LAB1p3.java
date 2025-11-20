import java.util.Scanner;

public class LAB1p3 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter number: "); 
        int num = input.nextInt();

        // show reult
        System.out.print("Output: "); 
        // process
        // (num % 2 == 0) check if true it's Even
        if (num % 2 == 0) {
            System.out.print("Even");
        }
        else {
            System.out.print("Odd");
        }
        // close scanner 
        input.close();
    }
}