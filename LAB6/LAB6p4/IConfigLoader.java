package LAB6.LAB6p4;
interface IconfigLoader {
    void loaderConfig() ;
}
//class 1
class DefualtLoder implements IconfigLoader {
    protected String defaultProfile ;
    public DefualtLoder (String defaultProfile) {
        setDefaultProfile(defaultProfile) ;
    }
    //implement 
    @Override
    public void loaderConfig() {
        System.out.println("Loading Default Profile:" + this.defaultProfile ) ;
    }
    //setter
    public void setDefaultProfile (String defaultProfile) {
        this.defaultProfile = defaultProfile ;
    }
}
//class 2
class UserLoder implements IconfigLoader {
    protected String userId ;
    public UserLoder (String userId) {
        setUserId(userId) ;
    }
    //implement 
    @Override
    public void loaderConfig() {
        System.out.println("Loading User Profile for ID:" + this.userId ) ;
    }
    //setter
    public void setUserId (String userId) {
        this.userId = userId ;
    }
}
