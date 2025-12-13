package LAB4.LAB4p11;

class Configuration {
    private final String theme ;
    private final int fontSize ;
    private final boolean darkMode ;
    public Configuration(String theme , int fontSize ,boolean darkMode) { 
        if (theme == null || theme.isEmpty()) {
            throw new IllegalArgumentException("Theme can't be null or empty.") ;
        }
        if (fontSize < 10) {
            this.fontSize = 10 ;
        } else if (fontSize > 20) {
            this.fontSize = 20 ;
        } else {
            this.fontSize = fontSize ;
        } 
        this.theme = theme ;
        this.darkMode = darkMode ;
    }
    //Merge con
    public Configuration(Configuration base , Configuration user) {
        this.theme = user.theme ;
        this.darkMode = user.darkMode ;
        this.fontSize = base.fontSize ;
    }

    public void displaySettings() {
        System.out.println("Theme:" + this.theme + ",Size:" + this.fontSize + ",Dark:" + this.darkMode  ) ; 
    }

}
