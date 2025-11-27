package LAB2.LAB2p8;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in ) ;

        double temp , result = 0.0f ;
       
        String mode = input.nextLine() ;
        temp = input.nextDouble() ;

        if (mode.equals("C_TO_F") ) result = TempConverter.celsiusToFahrenheit(temp) ;  
        else result = TempConverter.fahrenheitToCelsius(temp) ;

        System.out.println(result) ;
    
        input.close() ;

    }
}
