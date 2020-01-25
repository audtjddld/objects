package com.object.demo.refund.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Refund implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private Long totalPrice;

    private Long point;

    private String sendResult;

    public Refund(List<Long> refundLists) {
        this.totalPrice = refundLists.stream().reduce(0L, Long::sum);
        this.point = totalPrice * 10;
    }
}
