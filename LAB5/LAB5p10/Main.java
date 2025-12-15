package LAB5p10;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //complex task
        System.out.print("Enter description:" ) ;
        String descriptionCom = input.nextLine() ;
        System.out.print("Enter hours:" ) ;
        int hoursCom = input.nextInt() ;
        input.nextLine() ;
        System.out.print("Enter fee:" ) ;
        double feeCom = input.nextDouble() ;
        input.nextLine() ;
        //simple
        System.out.print("Enter description:" ) ;
        String descriptionSim = input.nextLine() ;
        System.out.print("Enter hours:" ) ;
        int hoursSim = input.nextInt() ;
        input.nextLine() ;
        //create obj
        ComplexTask complexTask = new ComplexTask(descriptionCom, hoursCom, feeCom) ;
        SimpleTask simpleTask = new SimpleTask(descriptionSim, hoursSim) ;
        //arr
        ProjectTask [] projectTasks = {complexTask , simpleTask} ;
        for (ProjectTask projectTask : projectTasks ) {
            System.out.println(projectTask.calculateCost()) ;
        }

        input.close() ;
    }
}