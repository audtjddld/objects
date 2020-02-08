package com.object.demo.myshop.order.infrastructure;

import com.object.demo.myshop.order.domain.Order;
import com.object.demo.myshop.order.domain.OrderNo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, OrderNo> {

}
