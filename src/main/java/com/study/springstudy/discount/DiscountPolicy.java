package com.study.springstudy.discount;

import com.study.springstudy.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @return 할인 대상 금액
     */
    int discount(Member member,int price);
}
