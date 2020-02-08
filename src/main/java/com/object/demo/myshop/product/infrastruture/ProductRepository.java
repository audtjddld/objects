package com.object.demo.myshop.product.infrastruture;

import com.object.demo.myshop.product.domain.Product;
import com.object.demo.myshop.product.domain.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
}
