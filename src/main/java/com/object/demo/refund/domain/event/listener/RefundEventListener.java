package com.object.demo.refund.domain.event.listener;

import com.object.demo.refund.application.refund.RefundService;
import com.object.demo.refund.domain.event.AggregateRefundEvent;
import com.object.demo.refund.domain.event.SapRefundResponseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RefundEventListener {

    private final RefundService service;

    public RefundEventListener(RefundService service) {
        this.service = service;
    }

    @EventListener(value = AggregateRefundEvent.class)
    public void listen(AggregateRefundEvent event) {
        log.info("집계 시작");
        service.aggregateRefund(event.getRefundLists());
    }

    @EventListener(value = SapRefundResponseEvent.class)
    public void listen(SapRefundResponseEvent event) {
        log.info("SAP 전송 결과 받음 : {}", event);
        service.update(event.getId(), event.getMessage());
    }
}
