package LAB2.LAB2p9;

class Address {
    //Attribute
    private String street ;
    private String city ;
    private String zipCode ;

    //constructor
    public Address (String street , String city, String zipCode ) {
        this.street = street ; 
        this.city = city ;
        this.zipCode = zipCode ;
    }

    public String getFullAddress() {
        return this.street + ", " + this.city + ", " + this.zipCode ;
    }

}
