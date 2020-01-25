package com.object.demo.sap.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class SapRefundRequest {
    private Long id;
    private Long totalPrice;
}
