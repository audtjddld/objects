package com.object.demo.myshop.order.domain;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;

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
