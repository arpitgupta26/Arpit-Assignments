package Answer3_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.tea.prepareHotDrink();
        restaurant.expressTea.prepareHotDrink();
    }
}
