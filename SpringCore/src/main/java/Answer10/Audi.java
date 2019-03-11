package Answer10;

import org.springframework.stereotype.Component;

@Component
public class Audi implements Car {
    @Override
    public void showDetails() {
        System.out.println("This is Audi");
    }
}
