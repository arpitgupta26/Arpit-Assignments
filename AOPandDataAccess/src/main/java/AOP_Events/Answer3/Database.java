package AOP_Events.Answer3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Database {
    
    @Autowired
    Publisher publisher;
    void connect(){
        publisher.publish();
        System.out.println("Connecting to database....");
        
    }
}
