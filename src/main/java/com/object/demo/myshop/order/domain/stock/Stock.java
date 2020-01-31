package com.object.demo.myshop.order.domain.stock;

import com.object.demo.myshop.order.domain.product.Product;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Table(name = "stock")
@Entity
public class Stock {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;

  @JoinColumn(name = "product_no")
  @OneToOne
  private Product product;

  @Embedded
  private StockCount count;
}
