package LAB5.LAB5p2;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Name:" ) ;
        String name = input.nextLine() ;
        System.out.print("Enter Age:" ) ;
        int age =  input.nextInt() ;
        input.nextLine() ;

        Cat cat = new Cat() ; 
        //set attribute
        cat.name = name ; 
        cat.age = age ;

        cat.displayInfo() ;
        cat.makeSound() ;
    
        input.close() ;
    }
}

