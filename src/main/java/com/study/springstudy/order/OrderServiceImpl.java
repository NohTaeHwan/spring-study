package com.study.springstudy.order;

import com.study.springstudy.discount.DiscountPolicy;
import com.study.springstudy.discount.FixDiscountPolicy;
import com.study.springstudy.member.Member;
import com.study.springstudy.member.MemberRepository;
import com.study.springstudy.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
