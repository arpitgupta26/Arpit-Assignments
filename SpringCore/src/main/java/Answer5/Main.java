package Answer5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Complex complex = context.getBean(Complex.class);
        System.out.println(complex.list);
        System.out.println(complex.set);
        System.out.println(complex.map);
    }
}
