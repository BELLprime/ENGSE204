package LAB3.LAB3p3;

public class User {
    
    private String password ; 

    public User (String initialPassword ) {
        
        this.password = initialPassword.trim() ;
        
    }

    public String getPassword ()  {

        return this.password ;

    }

    public void setPassword (String newPassword ) {

        String removeSP = newPassword.trim() ;

        if (removeSP.length() >= 8 ) {

            this.password = removeSP ;

            System.out.println("\nPassword updated.");
        
        } else if (removeSP.contains(" ")) {

            throw new IllegalArgumentException("Don't contain spaces!!!!!.") ;
        
        } else {

            throw new IllegalArgumentException("Password is too short.") ;
        
        }

    }

}   

