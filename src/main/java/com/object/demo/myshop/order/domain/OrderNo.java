package com.object.demo.myshop.order.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
@AllArgsConstructor
@Getter
public class OrderNo implements Serializable {

    @Column(name = "order_no")
    private String number;

    protected OrderNo() {

    }
}