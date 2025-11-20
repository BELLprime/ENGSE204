import java.util.Scanner;

public class LAB1p11 {
    // --- Function (Method) ---
    public static int sumArray(int[] numbers) {
        int sum = 0 ;
        for (int num = 0 ; num < numbers.length ; num ++ ) { 
            sum += numbers[num];
        }
        return sum ;
        /* or use 
         for (int num : numbers) {
            sum += num;
        } */
    }
    // --- End of Function ---

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N ;

        // Input score 
        System.out.print("Enter N: "); //จำนวนครั้ง
        N = input.nextInt();
        int[] Array = new int[N];

        for (int i = 0 ; i < N ; i++) {
            System.out.printf("%s %d%s" ,"Enter Number" , i+1 ,": "  ); 
            Array[i] = input.nextInt();
        }

        // Process calling function
        int result = sumArray(Array);

        // Output
        System.out.println("\nResult: " + result );

        // Close scanner 
        input.close();
    }
}