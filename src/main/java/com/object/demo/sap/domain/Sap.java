package com.object.demo.sap.domain;

import com.object.demo.common.EventProvider;
import com.object.demo.refund.domain.event.SapRefundResponseEvent;
import com.object.demo.sap.infastructure.Sender;
import com.object.demo.sap.model.RequestMessage;
import com.object.demo.sap.model.ResponseMessage;
import org.springframework.stereotype.Component;

@Component
public class Sap {

    private Sender sender;

    public Sap(Sender sender) {
        this.sender = sender;
    }

    public void send(RequestMessage requestMessage) {
        ResponseMessage send = sender.send(requestMessage);
        EventProvider.publisher(new SapRefundResponseEvent(send.getId(), send.getResponseMessage()));
    }

}
