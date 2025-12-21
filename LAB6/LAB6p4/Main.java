package LAB6.LAB6p4;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input
        System.out.print("Enter DefaultProfile:") ;
        String defaultProfile = input.nextLine() ;
        System.out.print("Enter UserID:") ;
        String userId = input.nextLine() ;
        //create obj 
        DefualtLoder defualtLoder = new DefualtLoder(defaultProfile) ;
        UserLoder userLoder = new UserLoder(userId) ;
        //array ของ interface
        IconfigLoader [] iconfigLoaders = { defualtLoder , userLoder} ;
        for (IconfigLoader iconfigLoader : iconfigLoaders) {
            iconfigLoader.loaderConfig();
        }
        input.close() ;
    }
}
