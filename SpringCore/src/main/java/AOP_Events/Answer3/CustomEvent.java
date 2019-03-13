package AOP_Events.Answer3;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    
    @Override
    public String toString() {
        return "This is my custom event object";
    }
}
