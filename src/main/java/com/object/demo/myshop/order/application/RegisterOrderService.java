package com.object.demo.myshop.order.application;

import com.object.demo.myshop.order.domain.Order;
import com.object.demo.myshop.order.domain.service.OrderService;
import com.object.demo.myshop.product.domain.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterOrderService {
    private final OrderService orderService;

    private final ProductService productService;

    public RegisterOrderService(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    @Transactional
    public void registerOrder(Order order) {
        // 주문 등록
    }

}
