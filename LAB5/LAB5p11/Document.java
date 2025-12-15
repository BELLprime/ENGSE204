package LAB5p11;
//superclass
class Document {
    protected String title ;
    public Document (String title) {
        this.title = title ;
    }
    public void  displayDetail () {
        System.out.println("Document: " + this.title) ;
    }
}
//subclass 1
class TextDocument extends Document {
    protected int wordCount ;
    public TextDocument (String title , int wordCount ) {
        super(title) ;
        this.wordCount = wordCount ;
    }
    @Override
    public void displayDetail () {
        System.out.println("Text: " + this.title + ", Words: " + this.wordCount) ;
    } 
}
//subclass 2
class PDFDocument extends Document {
    protected int pageCount ;
    public PDFDocument (String title , int pageCount ) {
        super(title) ;
        this.pageCount = pageCount ;
    }
    @Override
    public void displayDetail () {
        System.out.println("PDF: " + this.title + ", Pages: " + this.pageCount) ;
    } 
}