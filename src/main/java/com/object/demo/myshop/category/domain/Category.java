package com.object.demo.myshop.category.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Entity
public class Category {
    @Id
    private String  id;

    private String name;

    protected Category() {
    }
}
