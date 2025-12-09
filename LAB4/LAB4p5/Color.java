package LAB4.LAB4p5;

class Color {
    private int red ;
    private int green ;
    private int blue ;

    public Color (int r, int g , int b) { //validation RGB 0-255
        //red
        if (r < 0 ) {
            this.red = 0 ;
        } else if(r > 255) {
            this.red = 255 ;
        } else this.red = r ;
        //green
        if (g < 0) {
            this.green = 0 ;
        } else if (g > 255) {
            this.green = 255 ;
        } else this.green = g ;
        //blue
        if (b < 0) {
            this.blue = 0 ;
        } else if (b > 255) {
            this.blue = 255 ;
        } else this.blue = b ; 
    }

    public int getRed() {
        return this.red ;
    }
    public int getGreen() {
        return this.green ;
    }
    public int getBlue() {
        return this.blue ;
    }

    public void displayRGB() {
        System.out.println ("Red=" + getRed() + ",G=" + getGreen() + ",B=" + getBlue() ) ;
    }
}
