package com.object.demo.myshop.order.application;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.object.demo.myshop.order.domain.service.OrderService;
import com.object.demo.myshop.order.domain.Order;
import com.object.demo.myshop.order.domain.OrderNo;
import java.util.Optional;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DisplayName("주문 조회 테스트")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderServiceTest {

  @DisplayName("주문번호 0001일 때 조회하면")
  @Nested
  @ExtendWith(SpringExtension.class)
  @SpringBootTest
  public class test1 {

    @Autowired
    OrderService orderService;

    @Before
    public void init() {
      Order order = new Order(new OrderNo(String.format("0001")));
      orderService.create(order);
    }

    @Test
    @DisplayName("성공한다.")
    void success1() {
      OrderNo orderNo = new OrderNo("0001");
      Optional<Order> order = orderService.findByOrderNo(orderNo);
      order.ifPresent(o -> {
        assertThat(orderNo.getNumber(), is(o.getNumber()));
      });
    }
  }

  @DisplayName("신규 주문을 등록하면")
  @Nested
  @ExtendWith(SpringExtension.class)
  @SpringBootTest
  class test2 {

    @Autowired
    OrderService orderService;

    @Test
    @DisplayName("등록된다.")
    void success2() {
      Order order = new Order(new OrderNo("0002"));
      Order order1 = orderService.create(order);
      assertThat(order.getNumber(), is(order1.getNumber()));
    }
  }
}
