package LAB5p5;
//Superclass
class Shape {
    protected String name ;

    public Shape (String name)  {
        this.name = name ;
    }

    public double calculateArea() {
        return 0.0 ;
    }
}
//subclass 1
class Circle extends Shape {
    protected double radius ;

    public Circle (String name , double radius ) {
        super(name) ;
        this.radius = radius ;
    }

    @Override 
    public double calculateArea() {
        return 3.14159 * Math.pow(this.radius , 2 ) ;
    }
}
//subclass 2
class Rectangle extends Shape {
    protected double width ;
    protected double height ;

    public Rectangle (String name , double width ,double height) {
        super(name) ;
        this.width = width ;
        this.height = height ;
    }

    @Override 
    public double calculateArea () {
        return this.width * this.height ;
    }
} 