package LAB4.LAB4p8;

class Movie {
    private String title ;
    private String director ;
    private double rating ;

    public Movie (String title) { //chaining con
        this(title, "Unknown") ;
    }
    public Movie (String title , String director) { //chaining con
        this(title, director, 0.0) ;
    }
    public Movie (String title , String director, double rating ) { //chaining con
        if (title == null || title.isEmpty()) { 
            throw new IllegalArgumentException("Error : Title can't be null or empty"); 
        }
        if (director == null || director.isEmpty()) { 
            throw new IllegalArgumentException("Error : Director can't be null or empty"); 
        }
        this.title = title ;
        this.director = director ;
        this.rating = rating ;

        if ( this.rating > 10.0 ) {
            this.rating = 10.0 ;
        } else { 
            this.rating = 0.0 ;
        }
    }   
    public void displayDetails () {
        System.out.println("Title:" + this.title + ",Director:" + this.director + ",Rating:" + this.rating) ;
    }
    
}
