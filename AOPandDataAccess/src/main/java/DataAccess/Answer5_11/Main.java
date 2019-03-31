package DataAccess.Answer5_11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("data-access.xml");
        JdbcUser user = context.getBean(JdbcUser.class);
        user.countUsers();
        System.out.println(user.getUserName());
        user.insertUser();
        user.userDetails();
        user.allUsers();
        User user1 = user.getUser();
        System.out.println(user1);
        System.out.println("Total Users");
        user.hibernateCountUsers();
    }
}
