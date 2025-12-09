package LAB4.LAB4p8;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        Movie movie ; 

        try {
            int mode = input.nextInt() ; 
            input.nextLine() ;

            if (mode == 1) {
                String title = input.nextLine() ;
                movie = new Movie(title) ;
                movie.displayDetails() ;
            } else if (mode == 2) {
                String title = input.nextLine() ;
                String director = input.nextLine() ;
                movie = new Movie(title, director) ;
                movie.displayDetails() ;
            } else if (mode == 3) {
                String title = input.nextLine() ;
                String director = input.nextLine() ;
                Double rating = input.nextDouble() ;
                movie = new Movie(title, director, rating) ;
                movie.displayDetails() ;
            } else { //otherwise
                System.out.println ("Error : Mode must be between 1-3.") ;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()) ;
        } catch (Exception e) {
            System.out.println(" Error : Mode must be numberic (between 1-3) || can't be null or empty.") ;
        } finally {
            input.close( ) ; //alway close          
        }
    }
}
