package com.object.demo.myshop.order.domain;

import com.object.demo.myshop.product.domain.Product;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Table(name = "purchase_order_line")
@Entity
public class OrderLine {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;

  @JoinColumn(name = "number")
  @OneToOne(cascade = {CascadeType.ALL})
  private Order order;

  @OneToOne
  private Product product;

  public OrderLine(Order order, Product product) {
    this.order = order;
    this.product = product;
  }

  protected OrderLine() {

  }
}
