package LAB2.LAB2p4;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String Name = input.nextLine() ;
        int midtermScore = input.nextInt() ;
        int finalScore = input.nextInt() ;

        Student P1 = new Student(Name, midtermScore, finalScore) ;
        System.out.println("-----display-----") ;
        P1.displaySummary() ;

        input.close() ;

    }
}
