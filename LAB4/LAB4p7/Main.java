package LAB4.LAB4p7;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;

        String id1 = input.nextLine() ;
        String id2 = input.nextLine() ;
        String id3 = input.nextLine() ;

        Resource r1 = new Resource(id1) ;
        Resource r2 = new Resource(id2) ;
        Resource r3 = new Resource(id3) ;

        r1 = null ; //  ทำให้เป็น ขยะ for gc
        r2 = null ; //  ทำให้เป็น ขยะ for gc
        System.gc() ;
        r3 = null ;
        System.gc() ;
    
        input.close() ;
    }
}

