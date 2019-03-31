package AOP_Events.Answer8;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@org.aspectj.lang.annotation.Aspect
@EnableAspectJAutoProxy
public class Aspect {
    
    @Pointcut("execution(* start*())")
    void beforeStarting(){
    }
    
    @Before("beforeStarting()")
    void beforeStartingService(){
        System.out.println("Before Starting Service");
    }
}
