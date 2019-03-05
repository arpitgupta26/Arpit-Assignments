abstract class Pizza {
    
    String description = "pizza base";
    
    public String getDescription() {
        return description;
    }
    
    abstract int getCost();
}

class FarmHouse extends Pizza {
    
    public FarmHouse() {
        description = "FarmHouse";
    }
    
    @Override
    int getCost() {
        return 200;
    }
}

abstract class ToppingsDecorator extends Pizza {
    
    public abstract String getDescription();
    
}

class Margherita extends Pizza {
    
    public Margherita() {
        description = "Margherita";
    }
    
    @Override
    int getCost() {
        return 150;
    }
}

class ExtraVeggies extends ToppingsDecorator {
    
    Pizza pizza;
    
    public ExtraVeggies(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra veggies ";
    }
    
    @Override
    int getCost() {
        return 20 + pizza.getCost();
    }
}

class Cheese extends ToppingsDecorator {
    
    Pizza pizza;
    
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription()+", Extra Cheese ";
    }
    
    @Override
    int getCost() {
        return 50+pizza.getCost();
    }
}

public class Answer6 {
    public static void main(String[] args) {
        
        Pizza pizza1 = new Margherita();
        System.out.println(pizza1.getDescription()+" cost: "+pizza1.getCost());
        
        Pizza pizza2 = new FarmHouse();
        
        pizza2 = new Cheese(pizza2);
        System.out.println(pizza2.getDescription()+" cost: "+pizza2.getCost());
        
    }
}
