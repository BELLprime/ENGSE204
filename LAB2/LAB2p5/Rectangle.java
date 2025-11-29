package LAB2.LAB2p5;

class Rectangle {
    public Double width ;
    public Double height ;

    //construc
    public Rectangle (double width , double height ) {
        this.height = height ;
        this.width = width ;
    }

    //Met
    public double getArea () {
        double Area = this.height * this.width ;
        return Area ;
    }
    public double getPerimeter () {
        double Perimeter = (2 * (this.height + this.width) ) ;
        return Perimeter ;
    }

}
