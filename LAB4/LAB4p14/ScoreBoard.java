package LAB4.LAB4p14;

class ScoreBoard {
    private final String ganeName ;
    private final int [ ] scores ;
    //main con
    public ScoreBoard (String gameName ,int [] score) {
        if (gameName == null || gameName.isEmpty() || score == null) {
            throw new IllegalArgumentException("gameName and score can't be null");
        }
        this.ganeName = gameName ;
        this.scores =  score ; //shallow copy reference โดยตรง
    }
    //copy con
    public ScoreBoard (ScoreBoard other) {
        if (other == null) {
            throw new IllegalArgumentException("other ScoreBoard cannot be null");
        }
        this.ganeName = other.ganeName ;
        this.scores = new int[other.scores.length] ; //deep copy  สร้าง array ใหม่และ copy สมาชิกแต่ละตัว
        for (int i = 0 ; i < other.scores.length ; i++) {
            this.scores[i] = other.scores[i] ;
        }
    }

    public void displayScore() {
        System.out.println ( this.ganeName + ":" + scores[0] + "," + scores[1] + "," + scores[2] ) ;
    }
}
