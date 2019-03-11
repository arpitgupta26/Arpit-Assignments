package Answer10;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car {
    @Override
    public void showDetails() {
        System.out.println("This is BMW");
    }
}
