package LAB2.LAB2p9;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in ) ;

        System.out.print("Name : ") ; 
        String name = input.nextLine() ;
        System.out.print("Street : ") ; 
        String street = input.nextLine() ;
        System.out.print("City : ") ; 
        String City = input.nextLine() ;
        System.out.print("Postal Code : ") ; 
        String Postal = input.nextLine() ;

        Address address = new Address( street, City, Postal ) ;
        Student student = new Student( name , address ) ; 

        student.displayProfile() ;
    
        input.close() ;

    }
}

