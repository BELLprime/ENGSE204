package LAB2.LAB2p2;

import java.util.Scanner ;
//Write the code yourself, I don’t use AI 100%. code by natthakit
public class Main {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in) ; 
        
        System.out.print("Enter ID       : ") ;
        String ID = input.nextLine() ; 
        System.out.print("Enter Fullname : ") ;
        String Name = input.nextLine() ;

        Student P1 = new Student(ID, Name) ;

        P1.displayinfo () ;

        input.close() ;
    }
}
