package com.study.springstudy.order;

import com.study.springstudy.member.Grade;
import com.study.springstudy.member.Member;
import com.study.springstudy.member.MemberService;
import com.study.springstudy.member.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();

    @Test
    void createOrder(){
        // given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        // when
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        // then
        Assertions.assertEquals(order.getDiscountPrice(),1000);


    }
}
