import java.util.Scanner;

public class LAB1p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input score 
        System.out.print("Enter number: ");
        int Number = input.nextInt();

        // Process
        for (int i = 1; i <= 12 ; i++) {
           System.out.printf("%d x %d = %d\n" , Number , i , Number * i );
        }

        input.close();
    }
}