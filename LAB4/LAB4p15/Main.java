package LAB4.LAB4p15;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner scanner = new Scanner(System.in) ;
        
        int max = scanner.nextInt() ;
        scanner.nextLine() ;
        AuditRecord.setPolicy(max) ; //set max (static) 

        String user = scanner.nextLine() ;
        AuditRecord auditRecord = new AuditRecord(user) ;

        int N = scanner.nextInt() ;
        scanner.nextLine() ;

        for (int i = 0 ; i < N ; i++ ) {
            String messages = scanner.nextLine() ;
            if (messages.equals("SET_POLICY")) {
                int newmax = scanner.nextInt() ;
                AuditRecord.setPolicy(newmax) ; 
                scanner.nextLine() ;
            } else {
                auditRecord = auditRecord.addMessage(messages) ;
            }
        }
        auditRecord.displayLog() ;
        scanner.close() ;
    }
}
