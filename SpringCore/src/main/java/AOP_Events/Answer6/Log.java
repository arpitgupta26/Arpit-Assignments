package AOP_Events.Answer6;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
    
    @AfterThrowing(pointcut = "execution(void throwIOException())",throwing = "ex")
    void log(Exception ex){
        System.out.println("Running After " + ex);
    }
}
