package com.object.demo.myshop.review.domain;

import com.object.demo.myshop.member.domain.MemberId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Review {

    @Column(name = "review_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private MemberId memberId;

    private String name;

    private String content;
}
