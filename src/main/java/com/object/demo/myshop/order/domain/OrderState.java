package com.object.demo.myshop.order.domain;

public enum OrderState {
  PAYMENT_WAITING("지불대기"),
  PREPARING("상품준비중"),
  SHIPPED("상품적재"),
  DELIVERING("배송중"),
  DELIVERY_COMPLETED("배송완료"),
  CANCELED("취소");

  private String description;

  OrderState(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public static String description(OrderState orderState) {
    String description = "";
    for (OrderState value : OrderState.values()) {
      if (value.equals(orderState)) {
        description = orderState.getDescription();
        break;
      }
    }
    return description;
  }
}
