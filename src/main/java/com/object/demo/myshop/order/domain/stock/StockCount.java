package com.object.demo.myshop.order.domain.stock;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Embeddable
public class StockCount implements Serializable {

  private Integer count;

}
