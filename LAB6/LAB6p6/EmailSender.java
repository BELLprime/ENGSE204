package LAB6.LAB6p6;
interface IMessageService {
    void send(String recipient , String message) ;
}
//(concrete class) Low level implementation 
class EmailSender implements IMessageService {
    @Override 
    public void send(String recipient ,String  message) {
        System.out.println("Sending Email to " + recipient + ": " + message) ;
    }
}
class SMSSender implements IMessageService {
    @Override 
    public void send(String recipient ,String  message) {
        System.out.println("Sending SMS to " + recipient + ": " + message) ;
    }
}
//High level module
class Notifier {
    private IMessageService service ;//เก็น  interface เป็น Dependency
    //construct for inject dependency 
    public Notifier(IMessageService service) {
        setService(service) ;
    }
    public void sendNotification (String recipent , String message ) {
        service.send(recipent, message) ;        
    }
    //setter 
    public void setService(IMessageService service) {
        this.service = service ;
    }
}
