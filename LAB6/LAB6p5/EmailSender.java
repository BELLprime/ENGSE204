package LAB6.LAB6p5;
interface IMessageService {
    void send (String recipent , String message ) ;
}
//(concrete class) Low level implementation -->logic ซับซ้อน
class EmailSender implements IMessageService  {
    @Override 
    public void send(String recipent , String message ) {
        System.out.println("Sending Email to "+ recipent + ":" + message ) ;
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

