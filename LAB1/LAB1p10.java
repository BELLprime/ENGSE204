import java.util.Scanner;

public class LAB1p10 {
    // --- Function (Method) ---
    public static double calculateArea(double width, double height) {
        double result = width * height;
        return result;
    }
    // --- End of Function ---

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double W = 0.0f , H = 0.0f ;

        // Input score 
        System.out.print("Enter width: ");
        W = input.nextDouble();
        System.out.print("Enter height: ");
        H = input.nextDouble();

        // Process calling 
        double result = calculateArea(W, H);

        // Output
        System.out.println("\nResult: " + result );

        // Close scanner 
        input.close();
    }
}