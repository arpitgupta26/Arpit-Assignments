package AOP_Events.Answer1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("AOP_Events.Answer1");
        context.start();
        MyClass myClass = context.getBean(MyClass.class);
        myClass.display();
        context.stop();
        context.close();
    }
}
