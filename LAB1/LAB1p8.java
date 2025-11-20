import java.util.Scanner;

public class LAB1p8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N ;
        int holdMax = -999 ; //ค่าพัก

        // Input score 
        System.out.print("Enter N: "); //จำนวนครั้ง
        N = input.nextInt();
        int[] Array = new int[N];

        // Process
        for (int i = 0; i < N ; i++) {
            System.out.printf("%s %d%s" ,"Enter Number" , i+1 ,": "  ); 
            Array[i] = input.nextInt();
            // check find maximum value
            if (Array[i] > holdMax) {
                holdMax = Array[i] ;
            }
        }

        // Output
        System.out.println("\nThe Maximum Value is : " + holdMax );
        // Close scanner 
        input.close();
    }
}