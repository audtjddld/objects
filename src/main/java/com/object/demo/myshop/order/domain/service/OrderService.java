package com.object.demo.myshop.order.domain.service;

import com.object.demo.myshop.order.domain.Order;
import com.object.demo.myshop.order.domain.OrderNo;
import com.object.demo.myshop.order.infrastructure.OrderRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Context
 * 주문을 조회한다.
 * <p>
 * 주문을 생성한다.
 */

@Service
public class OrderService {

  private final OrderRepository repository;

  public OrderService(OrderRepository repository) {
    this.repository = repository;
  }

  @Transactional(readOnly = true)
  public Optional<Order> findByOrderNo(OrderNo orderNo) {
    return this.repository.findById(orderNo);
  }

  @Transactional
  public Order create(Order order) {
    return this.repository.save(order);
  }
}
