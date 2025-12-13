package LAB5.LAB5p6;
//Superclass
class Media {
    protected String title ;
    public Media (String title) {
        this.title = title ;
    }
    public void process() {
        System.out.println("Starting generic media processing") ;
    }
}
//subclass 1
class Video extends Media {
    protected int duration ;
    public Video (String title , int duration ) {
        super(title) ;
        this.duration = duration ;
    }
    @Override 
    public void process () {
        System.out.println("Processing video:" + this.title + " for " + this.duration + " minutes.") ;
    }
}
//subclass 2
class Audio extends Media {
    protected String quality ;
    public Audio (String title , String quality) {
        super(title) ;
        this.quality = quality ;
    }
    @Override
    public void process () {
        System.out.println("Processing audio:" + this.title + " with " + this.quality + " quality.") ;
    }
}
//Utility class 
class Processor {
    public static void runProcessor (Media m) {
        m.process() ;
    }
}