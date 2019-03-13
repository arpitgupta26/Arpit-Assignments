package AOP_Events.Answer8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext("AOP_Events.Answer8");
        Service service = context.getBean(Service.class);
        service.startService();
    }
}
