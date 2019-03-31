package AOP_Events.Answer3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Publisher implements ApplicationEventPublisherAware {
    ApplicationEventPublisher publisher;
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
    
    void publish(){
        CustomEvent event = new CustomEvent(this);
        publisher.publishEvent(event);
    }
}
