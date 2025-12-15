package LAB5p13;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner input = new Scanner(System.in) ;
        //Dev
        System.out.print("Enter Dev name:" ) ;
        String nameDev = input.nextLine() ;
        System.out.print("Enter projects:" ) ;
        int projectsDev = input.nextInt() ;
        input.nextLine() ;
        //admin
        System.out.print("Enter Admin name:" ) ;
        String nameAd = input.nextLine() ;
        System.out.print("Enter projects:" ) ;
        int projectsAd = input.nextInt() ;
        input.nextLine() ;
        System.out.print("Enter Adminkey:" ) ;
        String adminKey = input.nextLine() ;
        //create obj
        User u1 = new User("Guest") ;
        Developer d1 = new Developer(nameDev, projectsDev) ;
        Admin a1 = new Admin(nameAd, projectsAd, adminKey) ;
        //arr 
        User [] users = {u1 , d1, a1} ;
        int TotalClearance = 0 ;
        for (User user : users) {
            TotalClearance += user.getClearanceLevel() ;
        }
        for (User user : users) {
            if (user instanceof Admin) {
                Admin admin = (Admin) user ;
                System.out.println(admin.getAdminKey() ) ;
            }
        }
        System.out.println(TotalClearance);
        
        input.close() ;
    }
}