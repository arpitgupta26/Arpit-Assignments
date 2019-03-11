package Answer6_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
    @Autowired
    HotDrink coffee;
    Lemonade lemonade;
    
    @Autowired
    public Restaurant(HotDrink coffee , Lemonade lemonade) {
        this.coffee = coffee;
        this.lemonade = lemonade;
    }
    
    //@Autowired
    @Required
    public void setCoffee(HotDrink coffee) {
        this.coffee = coffee;
    }
    
    void prepareHotDrink(){
        coffee.prepareHotDrink();
    }
    
    void prepareLemonade(){
        lemonade.prepareLemonade();
    }
}
