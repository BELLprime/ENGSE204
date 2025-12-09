package LAB4.LAB4p1;

import java.util.Scanner ;

public class Main {
    public static void main (String [ ] args ) {
        Scanner input = new Scanner(System.in) ;

        String title, author ;
        Book book ;

        try {
            int mode = input.nextInt() ;
            input.nextLine() ; //clear buff 
            switch (mode) {
                case 1: //title 
                    title = input.nextLine() ;
                    book = new Book ( title ) ;
                    book.displayInfo () ;
                    break ;
                case 2: //title and author
                    title = input.nextLine() ;
                    author = input.nextLine() ;
                    book = new Book ( title, author) ;
                    book.displayInfo () ;
                    break ;
                default: //otherwise
                    System.out.println ("Mode must be 1 or 2 only") ;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()) ;
        } catch (Exception e) {
            System.out.println("Mode must be number only(1 or 2).") ;
        } finally {
            input.close() ;
        }
    }
}
