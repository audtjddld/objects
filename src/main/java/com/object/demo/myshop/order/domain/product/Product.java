package com.object.demo.myshop.order.domain.product;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Product {

  @EmbeddedId
  private ProductId no;

  private String title;

  private Long pcPrice;

  private Long mobilePrice;
}
