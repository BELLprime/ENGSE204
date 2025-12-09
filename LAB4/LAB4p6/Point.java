package LAB4.LAB4p6;

class Point {
    private final int x ; 
    private final int y ;

    public Point (int x , int y ) { //construct 
        this.x = x ;
        this.y = y ;
    }
    //get x
    public int getX() {
        return this.x ;
    }
    //get y
    public int getY() {
        return this.y ;
    }
    public Point move (int dx ,int dy) { //new obj
        int newX = this.x + dx ;
        int newY = this.y + dy ;
        return new Point(newX, newY) ;//create new obj
    }

    public void displayInfo() {
        System.out.println("("+ getX() + "," + getY() + ")") ;
    }
}
