package com.object.demo.myshop.order.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@AllArgsConstructor
@Embeddable
public class Money implements Serializable {
    private Long value;

    protected Money() {
    }
}
