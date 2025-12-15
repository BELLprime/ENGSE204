package LAB5p13;
//Superclass
class User {
    protected String name ;
    public User (String name ) {
        this.name = name ;
    } 
    public int getClearanceLevel() {
        return 1 ;
    }
}
//Subclass 1
class Developer extends User {
    protected int projects ;
    public Developer (String name , int projects ) {
        super(name) ;
        this.projects = projects ;
    }
    @Override 
    public int getClearanceLevel () {
        return 2; 
    } 
} 
//Subclass 2
class Admin extends Developer {
    protected String adminKey ;
    public Admin (String name , int projects ,String adminKey ) {
        super(name, projects) ;
        this.adminKey = adminKey ;
    }
    @Override 
    public int getClearanceLevel () {
        return 3; 
    } 
    public String getAdminKey () {
        return this.adminKey ;
    }
} 