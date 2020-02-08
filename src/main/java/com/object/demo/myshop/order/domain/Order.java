package com.object.demo.myshop.order.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Entity(name = "purchase_order")
@Access(AccessType.FIELD)
public class Order {

    @EmbeddedId
    private OrderNo number;

    @Enumerated(EnumType.STRING)
    private OrderState state;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    public Order() {

    }

    @Embedded
    private Orderer orderer;

    @Embedded
    private ShippingInfo shippingInfo;

    @Embedded
    private Receiver receiver;

    public Order(OrderNo number, OrderState state, Orderer orderer) {
        this.number = number;
        this.state = state;
        this.orderer = orderer;
    }

    @JoinColumn(name = "order_line_id")
    @OneToMany
    private List<OrderLine> orderLines;

    public Order(OrderNo number) {
        this.number = number;
    }

    /**
     * 서버시작시 컨텐츠 생성 테스트 위함 추후 삭제
     */
    public static Order createOrder(final OrderNo orderNo) {
        return new Order(orderNo, OrderState.PREPARING);
    }

    public Order(OrderNo id, OrderState state) {
        setNumber(id);
        this.state = state;
        this.orderDate = new Date();
    }

    private void setNumber(OrderNo number) {
        if (number == null) {
            throw new IllegalArgumentException("no number");
        }
        this.number = number;
    }

}
