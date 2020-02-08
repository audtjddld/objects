package com.object.demo.myshop.category.domain.service;

import com.object.demo.myshop.category.infrastructure.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }
}
