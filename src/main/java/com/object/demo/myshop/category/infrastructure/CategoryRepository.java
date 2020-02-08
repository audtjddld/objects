package com.object.demo.myshop.category.infrastructure;

import com.object.demo.myshop.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
