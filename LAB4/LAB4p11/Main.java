package LAB4.LAB4p11;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;

        try {
            String BaseTheme = sc.nextLine() ;
            int BaseFontsize = sc.nextInt() ;
            sc.nextLine() ;
            boolean BaseDarkmode = sc.nextBoolean() ;
            sc.nextLine() ;
            String UserTheme = sc.nextLine() ;
            int UserFontsize = sc.nextInt() ;
            sc.nextLine() ;
            boolean UserDarkmode = sc.nextBoolean() ;
            sc.nextLine() ;
            
            Configuration baseConfig = new Configuration(BaseTheme, BaseFontsize ,BaseDarkmode) ;
            Configuration userConfig = new Configuration(UserTheme, UserFontsize ,UserDarkmode) ;
            Configuration finalConfig = new Configuration(baseConfig, userConfig) ;
            
            finalConfig.displaySettings();
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage() ) ;
        } catch (Exception e) { 
            System.out.println("Something went wrong! (Maybe wrong input?).") ;
        } finally {
            sc.close() ;
        }
    }
}