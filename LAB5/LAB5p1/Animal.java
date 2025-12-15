package LAB5p1;
//superclasss
class Animal {
    protected String name ;
    protected int age ;

    public void displayInfo () {
        System.out.println("Name:" + this.name +  ", Age:" + this.age ) ;
    }
}
//subclass
class Dog extends Animal {
    public void makeSound () {
        System.out.println("Woof! Woof!" ) ;
    }
}