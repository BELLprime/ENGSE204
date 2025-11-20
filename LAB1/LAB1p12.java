import java.util.Scanner;
public class LAB1p12 {
    // --- Function (Method) ---
    public static void Search(int searchID, int[] ID , int[] Stock) {
        boolean found = false ;
        for (int i = 0 ; i < ID.length ; i++ ) {
            if (searchID == ID[i] ) {
                System.out.println("Stock Quantity is : " + Stock[i]);
                found = true ;
                break ;
            }
        }
        if (!found) {
            System.out.println("Product " + searchID + " not found");
        }
    }
    // --- End of Function ---
    public static void main (String[] agrs) {
        Scanner input = new Scanner(System.in);
        int N ;
        // Input
        System.out.print("Enter N: ") ; //จำนวนครั้ง
        N = input.nextInt() ;
        int[] productID = new int[N] ;
        int[] stockQuantity = new int[N] ;

        for (int i = 0 ; i < N ; i++ ) {
           System.out.print("Enter ID " + ( i+1 ) + ": " ) ; 
           productID[i] = input.nextInt();
           System.out.print("Enter Stock " + ( i+1 ) + ": " ) ; 
           stockQuantity[i] = input.nextInt() ;
        }
        // Process Search ID
        System.out.print("Search ID : ") ;
        int searchID = input.nextInt() ;
        Search(searchID , productID , stockQuantity ) ; //function

        // Close scanner 
        input.close();
    }
}
