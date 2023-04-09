package com.study.springstudy;

import com.study.springstudy.member.Grade;
import com.study.springstudy.member.Member;
import com.study.springstudy.member.MemberService;
import com.study.springstudy.order.Order;
import com.study.springstudy.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculate = " + order.calculatePrice());
    }
}
