package LAB4.LAB4p7;

class Resource {
    private String id ;

    public Resource (String id ) { //con
        if (id == null || id.isEmpty() ) {
            throw new IllegalArgumentException ("Error :id can't be empty or null.") ;
        }
        this.id = id ;
        System.out.println ("Resource " + this.id + " created.") ;
    }

    @Override
    protected void finalize () throws Throwable{
        
        System.out.println("Resouce " + this.id +" finalized (destroyed.)" ) ;
        super.finalize() ;
    }
}
