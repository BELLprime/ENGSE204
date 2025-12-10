package LAB4.LAB4p13;

class Subscription {
    private final String planName ;
    private final int durationDays ;

    private static int maxDuration = 365 ;
    //main construct 
    public Subscription (String planName , int durationDays) { 
        //validation 
        if (planName == null || planName.isEmpty() ) {
            throw  new  IllegalArgumentException("Error : Plan name can't be null or empty.") ;
        }
        if (durationDays > maxDuration) {
            this.durationDays = maxDuration ;
        } else if (durationDays < 0 ) {
            this.durationDays = 0 ;
        } else this.durationDays = durationDays ;

        this.planName = planName ;
    }
    //copy construct
    public Subscription (Subscription other ) {
        this.planName = other.planName ;
        this.durationDays = other.durationDays ;
    }

    //method
    public static void setMaxDuration (int max) {
        if (max > 0) {
            maxDuration = max ;
            System.out.println ("Max duration set to " + max + ".") ;
        } else if (max <= 0) {
            throw new IllegalArgumentException("Iinvalid max policy.") ;
        }  else new IllegalArgumentException("Iinvalid input.") ;
    }

    public Subscription extend (int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.") ;
            return this ;
        }
        int newDays = this.durationDays + days ;
        if (newDays > maxDuration){
            System.out.println("Extension failed:Excessds max policy.") ;
            return this ;
        } else {
            System.out.println("Extension successful.") ;
            return new Subscription(this.planName ,newDays) ;
        }
    }

    public void displayInfo () {
        System.out.println ("Plan:" + this.planName + ",Days:" + this.durationDays ) ;
    }
}
