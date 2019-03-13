package AOP_Events.Answer6;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Service {
    
    void startService(){
        System.out.println("Starting Service");
        try{
            throw new IOException();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    void stopService(){
        System.out.println("Stopping Service");
    }
    
    void closeService(){
        System.out.println("Closing Service");
        try{
            throw new IOException();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
