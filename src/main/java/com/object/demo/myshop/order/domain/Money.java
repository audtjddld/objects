package com.object.demo.myshop.order.domain;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Embeddable
public class Money {
  private Long value;

  public Long getValue() {
    return value;
  }
}
