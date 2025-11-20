import java.util.Scanner;

public class LAB1p2 { // for formula of rectangle area is -->  Area = Width * Height 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Show Heading
        System.out.println("Find area of rectangle program");
        // Input
        System.out.print("Enter Width: ");
        double Width = input.nextDouble();
        System.out.print("Enter Height: ");
        double Height = input.nextDouble();
        // Cal area of rectangle
        double result = Width * Height ;
        System.out.print("Area of rectangle is : " + result);

        input.close();
    }
}
