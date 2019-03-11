package Answer6_9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurant = context.getBean(Restaurant.class);
        Restaurant restaurant1 = context.getBean(Restaurant.class);
        if(restaurant==restaurant1){
            System.out.println("Same references");
        }
        restaurant.prepareHotDrink();
        restaurant.prepareLemonade();
        
    }
}
