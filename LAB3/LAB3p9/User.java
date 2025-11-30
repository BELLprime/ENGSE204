package LAB3.LAB3p9;

class User {

    private String username ;
    private String password ;

    private static int minPasswordLength = 8 ;

    public User ( String username , String password) {
        if ( password.trim().length() >= minPasswordLength ) {

            this.password = password ;
            System.out.println("Creation successful." ) ;

        }  else {
            
            this.password = "invalid" ;
            System.out.println( "Creation failed." ) ;

        }

    }
    public String getPassword() {
        
        return this.password ;
    }

    public void setPassword(String newPassword) {
        if ( newPassword.length() >= minPasswordLength ) {

            this.password = newPassword ;
            System.out.println("Update successful." ) ;

        }  else {
            
            throw new IllegalArgumentException( "Update failed." ) ;

        }
    }

    public static void setMinLength (int length) {
        if ( length >= 4 ) {

            minPasswordLength = length ;
            System.out.println("New min length set to " + length) ;
            
        } else {

            throw new IllegalArgumentException("Invalid length.") ;
        }
    }
    
    public static int getMinLength() {

        return minPasswordLength ;
    }
}
