package AOP_Events.Answer3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("AOP_Events.Answer3");
        Database database = context.getBean(Database.class);
        database.connect();
    }
}
