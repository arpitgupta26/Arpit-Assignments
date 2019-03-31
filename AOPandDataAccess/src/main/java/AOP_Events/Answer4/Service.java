package AOP_Events.Answer4;

import org.springframework.stereotype.Component;

@Component
public class Service {
    
    public void createService(){
        System.out.println("Creating Service");
    }
    
    public void runService(){
        System.out.println("Running Service....");
    }
    
    public void endService(){
        System.out.println("Ending Service");
    }
}
