package com.object.demo.myshop.product.domain.service;

import com.object.demo.myshop.product.infrastruture.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

}
