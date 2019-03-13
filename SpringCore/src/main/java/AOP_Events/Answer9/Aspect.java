package AOP_Events.Answer9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@EnableAspectJAutoProxy
public class Aspect {
    
    @Before("execution(* startService(..))")
    void showSignatureArgs(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("Going to call");
        System.out.println(signature);
        Object[] parameters = joinPoint.getArgs();
        System.out.println("With following parameters");
        for (Object obj: parameters) {
            System.out.println(obj);
        }
    }
}
