package LAB5p1;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Name:" ) ;
        String name = input.nextLine() ;
        System.out.print("Enter Age:" ) ;
        int age =  input.nextInt() ;
        input.nextLine() ;

        Dog dog = new Dog() ; 
        //set attribute
        dog.name = name ; 
        dog.age = age ;

        dog.makeSound() ;
        dog.displayInfo() ;
    
        input.close() ;
    }
}