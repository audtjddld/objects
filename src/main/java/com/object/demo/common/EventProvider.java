package com.object.demo.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Slf4j
@Component
public class EventProvider implements ApplicationEventPublisherAware {

    private static ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        EventProvider.publisher = applicationEventPublisher;
    }

    public static void publisher(Object event) {
        if (Objects.isNull(event)) {
            log.error(">>>>>>> event is null");
            return;
        }
        EventProvider.publisher.publishEvent(event);
    }
}
