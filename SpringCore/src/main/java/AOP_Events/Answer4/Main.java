package AOP_Events.Answer4;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Service service = context.getBean(Service.class);
        service.createService();
        service.runService();
        service.endService();
    }
}
