package com.object.demo.myshop.order.config;

import com.object.demo.myshop.order.domain.service.OrderService;
import com.object.demo.myshop.order.domain.Order;
import com.object.demo.myshop.order.domain.OrderNo;
import com.object.demo.myshop.order.domain.OrderState;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitData {

  private final OrderService service;

  public InitData(OrderService service) {
    this.service = service;
  }

  @PostConstruct
  public void init() {
    Order order = new Order(new OrderNo(UUID.randomUUID().toString()), OrderState.PREPARING);
  }
}
