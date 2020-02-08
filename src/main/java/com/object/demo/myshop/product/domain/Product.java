package com.object.demo.myshop.product.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.object.demo.myshop.review.domain.Review;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Product {

  @EmbeddedId
  private ProductId productId;

  private String title;

  private Long pcPrice;

  private Long mobilePrice;

  @JoinColumn(name = "review_id")
  @OneToMany
  private List<Review> reviews;
}
