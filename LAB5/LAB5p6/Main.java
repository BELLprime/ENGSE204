package LAB5p6;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        //Video
        System.out.print("Enter title:" ) ;
        String title = input.nextLine() ;
        System.out.print("Enter duration:" ) ;
        int duration = input.nextInt() ;
        input.nextLine() ;
        //Audio
        System.out.print("Enter title:" ) ;
        String title2 = input.nextLine() ;
        System.out.print("Enter quality:" ) ;
        String quality = input.nextLine() ;
        
        Video video = new Video(title, duration) ;
        Audio audio = new Audio(title2, quality) ;

        Processor.runProcessor(video) ;
        Processor.runProcessor(audio) ;

        input.close() ;
    }
}
