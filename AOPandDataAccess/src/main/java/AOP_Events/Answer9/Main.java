package AOP_Events.Answer9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext("AOP_Events.Answer9");
        Service service = context.getBean(Service.class);
        service.startService("Get Connection", 5);
    }
}
