package com.object.demo.myshop.member.infrastructure;

import com.object.demo.myshop.member.domain.Member;
import com.object.demo.myshop.member.domain.MemberId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, MemberId> {
}
