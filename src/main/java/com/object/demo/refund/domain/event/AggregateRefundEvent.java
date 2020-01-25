package com.object.demo.refund.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class AggregateRefundEvent {
    private List<Long> refundLists;
}
