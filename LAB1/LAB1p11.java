import java.util.Scanner;

public class LAB1p11 {
    // --- Function (Method) ---
    public static int sumArray(int[] numbers) {
        int sum = 0 ;
        for (int num = 0 ; num < numbers.length ; num ++ ) { 
            sum += numbers[num];
        }
        return sum ;
    }
    // --- End of Function ---

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;

        // Input score 
        System.out.print("Enter n: "); //จำนวนครั้ง
        n = input.nextInt();
        int[] Array = new int[n];

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // calling function
        int result = sumArray(Array);

        // Output
        System.out.println("\nResult: " + result );

        // Close scanner 
        input.close();
    }
}