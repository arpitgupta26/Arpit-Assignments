package Answer1_2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = context.getBean(Database.class);
        System.out.println(database.name);
        System.out.println(database.port);
    }
}
