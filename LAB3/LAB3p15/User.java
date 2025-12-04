package LAB3.LAB3p15;
class User {
    private String username ;
    private int failedAttempts ;
    private boolean isLocked ;

    private static int maxAttempts = 3 ; //start
    //construct
    public User (String username) {
        this.username = username ;
        this.failedAttempts = 0 ; 
        this.isLocked = false ;
    }
    public String getUsername() { //read 
        return this.username ; 
    }
    public boolean isLocked() {  //read 
        return this.isLocked ; 
    }
    public int getFailedAttempts() {  //read 
        return this.failedAttempts ; 
    }
    public static void setPolicy (int max) { //throw error
        if ( max > 0 ) {
            maxAttempts = max ; 
            System.out.println("Policy updated.") ;
        } else {
            throw new IllegalArgumentException("Invalid policy.") ;
        } 
    }
    public void login(String password) {
        if ( this.isLocked == true ) {
            System.out.println("Account is locked.") ;
        } else if (this.isLocked == false && password.equals("pass123") )  { //if used password is pass123 
            this.failedAttempts = 0 ;
            System.out.println("Login successful.") ;
        } else if (this.isLocked == false && !password.equals("pass123") ) { //if used password is pass123 
            this.failedAttempts++ ; //+1
            if ( this.failedAttempts >= maxAttempts ) {
                this.isLocked = true ;
                System.out.println("Login failed. Account locked.") ;
            } else {
                System.out.println("Login failed. " + (maxAttempts - this.failedAttempts) + " attempts left." ) ; //failed
            }
        }
    }
}
