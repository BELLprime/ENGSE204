package LAB4.LAB4p1;

class Book {
    
    private String title ;
    private String author ;

    public Book (String title) { 
        this(title, "Unknown") ;
    }

    public Book (String title , String author ) { //master con
        if (title == null || title.isEmpty()) { 
            throw new IllegalArgumentException("title or author name can't be empty"); 
        }
        if (author == null || author.isEmpty()) { 
            throw new IllegalArgumentException("author name or title can't be empty"); 
        }
        this.title = title ;
        this.author = author ;
    }

    public void displayInfo () {
        System.out.println("Title: " + this.title  +",Author: " + this.author ) ;
    }
}
