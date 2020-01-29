package com.object.demo.myshop.order.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@SuppressWarnings("serial")
@Embeddable
@AllArgsConstructor
@Getter
public class OrderNo implements Serializable {
  @Column(name="order_number")
  private String number;

  @SuppressWarnings("unused")
  private OrderNo(){}
}