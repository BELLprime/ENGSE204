package LAB4.LAB4p15;

import java.util.Scanner ;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in) ;
        
        int max = sc.nextInt() ;
        sc.nextLine() ;
        AuditRecord.setPolicy(max) ; //set max (static) 

        String user = sc.nextLine() ;
        AuditRecord auditRecord = new AuditRecord(user) ;

        int N = sc.nextInt() ;
        sc.nextLine() ;

        for (int i = 0 ; i < N ; i++ ) {
            String messages = sc.nextLine() ;
            if (messages.equals("SET_POLICY")) {
                int newmax = sc.nextInt() ;
                AuditRecord.setPolicy(newmax) ; //set max (static)
                sc.nextLine() ;
            } else {
                auditRecord = auditRecord.addMessage(messages) ;
            }
        }
        auditRecord.displayLog() ;

        sc.close() ;
    }
}
