package com.object.demo.refund.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class SapRefundResponseEvent {

    private Long id;
    private String message;

}
