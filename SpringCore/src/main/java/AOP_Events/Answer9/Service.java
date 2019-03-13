package AOP_Events.Answer9;

import org.springframework.stereotype.Component;

@Component
public class Service {
    void startService(String name, Integer priority){
        System.out.println("Starting " + name + " Service with priority " + priority);
    }
}
