package Answer10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarFactory {
    
    @Autowired
    BMW bmw;
    
    public void showDetails() {
        bmw.showDetails();
    }
}
