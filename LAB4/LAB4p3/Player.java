package LAB4.LAB4p3;

class Player {
    private String username ;
    private int level ;

    public Player () {  // default construct 
        this("Guest", 1) ;
    }

    public Player( String username , int level) { //main construct
        if (username == null || username.isEmpty()) { 
            throw new IllegalArgumentException("Username can't be empty"); 
        }
        this.username = username ;
        this.level = level ;
    }

    public void displayProfile () {
        System.out.println("User: " + this.username + ",Level: " + this.level ) ;
    }
}
