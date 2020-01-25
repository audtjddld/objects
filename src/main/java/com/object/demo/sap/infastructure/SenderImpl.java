package com.object.demo.sap.infastructure;

import com.object.demo.sap.model.RequestMessage;
import com.object.demo.sap.model.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Component
public class SenderImpl implements Sender {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public ResponseMessage send(RequestMessage message) {
        log.info("receive message");
        if (count.incrementAndGet() % 2 == 0) {
            return new ResponseMessage(message.getId(), "success");
        } else {
            return new ResponseMessage(message.getId(), "fail");
        }
    }
}
