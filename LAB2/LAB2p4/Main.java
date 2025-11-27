package LAB2.LAB2p4;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine() ;
        int midterm_score = input.nextInt() ;
        int final_score = input.nextInt() ;

        Student P1 = new Student(name, midterm_score, final_score) ;
        P1.displaySummary() ;

        input.close() ;

    }
}
