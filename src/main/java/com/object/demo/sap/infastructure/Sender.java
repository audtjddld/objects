package com.object.demo.sap.infastructure;

import com.object.demo.sap.model.RequestMessage;
import com.object.demo.sap.model.ResponseMessage;

public interface Sender {
    ResponseMessage send(RequestMessage message);
}
