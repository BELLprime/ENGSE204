package LAB5.LAB5p2 ;
//superclasss
class Animal {
    protected String name ;
    protected int age ;

    public void makeSound() {
        System.out.println("I am an animal." ) ;
    }

    public void displayInfo () {
        System.out.println("Name:" + this.name +  ", Age:" + this.age ) ;
    }
}
//subclass
class Cat extends Animal {
    
    @Override //overriding 
    public void makeSound () {
        System.out.println("Meow!" ) ;
    }
}
