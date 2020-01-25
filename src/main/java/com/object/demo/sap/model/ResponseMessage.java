package com.object.demo.sap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseMessage {
    private Long id;
    private String responseMessage;
}
