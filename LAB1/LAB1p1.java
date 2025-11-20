import java.util.Scanner;

public class LAB1p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = input.nextInt();
        
        System.out.print("Enter y: ");
        int y = input.nextInt();

        System.out.println(x + y);

        input.close();
    }
}