package com.object.demo.myshop.order.application;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.object.demo.myshop.order.application.order.OrderService;
import com.object.demo.myshop.order.domain.OrderNo;
import com.object.demo.myshop.order.infrastruture.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@DisplayName("Order Service 테스트")
public class OrderServiceTest {

  @Autowired
  private OrderService orderService;
  @Autowired
  private OrderRepository orderRepository;
  

  @Nested
  @DisplayName("Context : 객체를 조회한다")
  class 객체를_조회_한다 {

    private OrderNo orderNo = new OrderNo("1234");

    @Test
    @DisplayName("조회 결과 OrderNo 1234의 값을 가져온다")
    void success() {
      assertThat(orderNo, is(new OrderNo("1234")));
    }
  }
}
