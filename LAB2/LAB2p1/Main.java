package LAB2.LAB2p1;

import java.util.Scanner ;
//Write the code yourself, I don’t use AI 100%. code by natthakit
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        //input
        System.out.print("Enter ID       : ") ;
        String ID = input.nextLine() ; 
        System.out.print("Enter Fullname : ") ;
        String Name = input.nextLine() ; 

        Student P1 = new Student(ID , Name) ; //create obj form class

        System.out.println("------Display------ ") ;
        System.out.println( P1.getID() ) ;
        System.out.println( P1.getName() ) ;

        input.close();
    }
}
