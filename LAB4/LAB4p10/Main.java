package LAB4.LAB4p10;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;
        //input
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
        //merge process
        Configuration baseConfig = new Configuration(BaseTheme, BaseFontsize ,BaseDarkmode) ;
        Configuration userConfig = new Configuration(UserTheme, UserFontsize ,UserDarkmode) ;
        Configuration finalConfig = new Configuration(baseConfig, userConfig) ;
        //display
        finalConfig.displaySettings();

        sc.close() ;
    }
}