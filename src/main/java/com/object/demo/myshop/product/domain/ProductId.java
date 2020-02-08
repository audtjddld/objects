package com.object.demo.myshop.product.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class ProductId implements Serializable {

  @Column(name = "product_id")
  private Long id;

  protected ProductId() {
  }
}
