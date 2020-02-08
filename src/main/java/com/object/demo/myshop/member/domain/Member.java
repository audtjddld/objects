package com.object.demo.myshop.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@AllArgsConstructor
@Getter
@Entity
public class Member {

    @EmbeddedId
    private MemberId memberId;

    private String name;

    protected Member() {
    }
}
