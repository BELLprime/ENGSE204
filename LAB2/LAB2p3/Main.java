package LAB2.LAB2p3;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in) ; 

        String ID ,Name ;
        int N = input.nextInt() ;

        input.nextLine() ; // clear buff
        Student [] P = new Student[N] ; 

        for (int i = 0 ; i < N ; i++ ) {
        
            System.out.printf("%s %d\t\t:" ,"Enter ID " , i+1) ;
            ID = input.nextLine() ; 
            System.out.printf("%s %d\t:" ,"Enter Fullname ",i+1) ;
            Name = input.nextLine() ;

            System.out.println() ;
            P [i] = new Student(ID , Name) ; //create obj
        }
        System.out.print("Student Count : " + Student.studentCount) ;

        input.close() ;

    }
}