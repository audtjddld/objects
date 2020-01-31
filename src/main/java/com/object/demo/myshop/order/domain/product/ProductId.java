package com.object.demo.myshop.order.domain.product;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class ProductId implements Serializable {

  private Long number;
}
