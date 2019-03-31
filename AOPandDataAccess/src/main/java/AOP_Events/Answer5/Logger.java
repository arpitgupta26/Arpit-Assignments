package AOP_Events.Answer5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    
    @Around("execution(void startService())")
    void log(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("Log before");
        proceedingJoinPoint.proceed();
        System.out.println("Log after");
    }
}
