package AOP_Events.Answer8;

import org.springframework.stereotype.Component;

@Component
public class Service {
    
    public void startService(){
        System.out.println("Starting service");
    }
    
    public void stopService(){
        System.out.println("Stopping service");
    }
}
