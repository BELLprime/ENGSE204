package LAB2.LAB2p9;

class Student {
    //Attribute
    private String name ;
    private Address address ; // Class-Attribute

    //construc
    public Student (String name , Address address ) {
        this.name = name ;
        this.address = address ;  
    }
    
    //met
    public void displayProfile() {
        System.out.println("Name: " + this.name) ;
        System.out.println("Address: " + this.address.getFullAddress() ) ;
    }
}
