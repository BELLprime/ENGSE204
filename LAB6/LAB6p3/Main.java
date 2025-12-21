package LAB6.LAB6p3;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input
        System.out.print("Enter Name:") ;
        String name = input.nextLine() ;
        System.out.print("Enter Price:") ;
        double price = input.nextDouble() ;
        //create obj
        Book book = new Book(name, price) ;
        System.out.println(book.calculateFinalPrice() ) ;
        input.close();
    }
}
