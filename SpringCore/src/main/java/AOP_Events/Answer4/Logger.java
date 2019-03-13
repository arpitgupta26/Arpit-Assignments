package AOP_Events.Answer4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    
    @Before("execution(* AOP_Events.Answer4.Service.*())")
    public void logService(){
        System.out.println("Service Log");
    }
}
