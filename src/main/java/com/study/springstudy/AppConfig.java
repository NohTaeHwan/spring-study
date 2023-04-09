package com.study.springstudy;

import com.study.springstudy.discount.FixDiscountPolicy;
import com.study.springstudy.member.MemberService;
import com.study.springstudy.member.MemberServiceImpl;
import com.study.springstudy.member.MemoryMemberRepository;
import com.study.springstudy.order.OrderService;
import com.study.springstudy.order.OrderServiceImpl;

/**
 * AppConfig
 * 의존관계 주입
 */
public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new FixDiscountPolicy(), new MemoryMemberRepository());
    }
}
