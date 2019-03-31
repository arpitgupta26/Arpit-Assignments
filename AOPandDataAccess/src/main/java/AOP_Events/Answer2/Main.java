package AOP_Events.Answer2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("AOP_Events.Answer2");
        context.start();
        context.stop();
        context.start();
        context.close();
        context.start(); //cannot start context after closing
    }
}
