package com.study.springstudy;

import com.study.springstudy.discount.DiscountPolicy;
import com.study.springstudy.discount.FixDiscountPolicy;
import com.study.springstudy.discount.RateDiscountPolicy;
import com.study.springstudy.member.MemberRepository;
import com.study.springstudy.member.MemberService;
import com.study.springstudy.member.MemberServiceImpl;
import com.study.springstudy.member.MemoryMemberRepository;
import com.study.springstudy.order.OrderService;
import com.study.springstudy.order.OrderServiceImpl;

/**
 * AppConfig
 * 객체 생성 및 의존 관계 주입
 */
public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(discountPolicy(), memberRepository());
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
