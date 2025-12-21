package LAB6.LAB6p8;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in) ;
        //input
        System.out.print("Enter Name :") ;
        String name1 = input.nextLine() ;
        System.out.print("Enter Base Power :") ;
        double basePower1 = input.nextDouble() ;
        System.out.print("Enter Hours :") ;
        int hour1 = input.nextInt() ; 
        input.nextLine() ;
        System.out.print("Enter Name :") ;
        String name2 = input.nextLine() ;
        System.out.print("Enter Base Power :") ;
        double basePower2 = input.nextDouble() ;
        System.out.print("Enter Hours :") ;
        int hour2 = input.nextInt() ; 
        input.nextLine() ;
        //create obj 
        SolarPanel p1 = new SolarPanel(name1, basePower1, hour1) ;
        SolarPanel p2 = new SolarPanel(name2, basePower2, hour2) ;
        p1.increaseUsage(100) ;
        //array
        PowerGenerator [] powerGenerators = {p1 , p2} ;
        for (PowerGenerator powerGenerator : powerGenerators) {
            SolarPanel solarPanel = (SolarPanel) powerGenerator ;//Down casting Parent clss to child class
            System.out.println(solarPanel.calculateFinalOutput()) ;
        }
        input.close();
    }
}

