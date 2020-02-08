package com.object.demo.myshop.member.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@EqualsAndHashCode
@AllArgsConstructor
@Embeddable
@Getter
public class MemberId implements Serializable {

    @Column(name = "member_id")
    private String id;

    protected MemberId() {
    }
}
