package com.object.demo.myshop.member.domain.service;

import com.object.demo.myshop.member.infrastructure.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }
}
