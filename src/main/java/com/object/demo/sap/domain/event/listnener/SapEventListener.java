package com.object.demo.sap.domain.event.listnener;

import com.object.demo.sap.domain.Sap;
import com.object.demo.sap.domain.event.SapRefundRequest;
import com.object.demo.sap.model.RequestMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SapEventListener {

    private final Sap sap;

    public SapEventListener(Sap sap) {
        this.sap = sap;
    }

    @EventListener(value = SapRefundRequest.class)
    public void listen(SapRefundRequest event) {
        log.info("집계 내역 SAP 전송 : {}", event);
        sap.send(new RequestMessage(event.getId(), event.getTotalPrice()));
    }
}
