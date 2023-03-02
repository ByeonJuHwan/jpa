package com.example.jpa.controller;

import com.example.jpa.domain.Order;
import com.example.jpa.example.MemberEx;
import com.example.jpa.example.OrderEx;
import com.example.jpa.example.ProductEx;
import com.example.jpa.repository.MemberRepository;
import com.example.jpa.repository.OrderRepository;
import com.example.jpa.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ExampleMain {

    private final MemberRepository memberRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    @GetMapping("/")
    public void example() {

//        MemberEx member1 = new MemberEx();
//        member1.setId("member1");
//        member1.setUsername("회원1");
//        memberRepository.save(member1);
//
//        ProductEx product = new ProductEx();
//        product.setId("productA");
//        product.setName("상품1");
//        productRepository.save(product);
//
//        // 주문 저장
//        OrderEx order = new OrderEx();
//        order.setMember(member1); // 주문회원 - 연관관계 설정
//        order.setProduct(product); // 주문상품 - 연관관계 설정
//        order.setOrderAmount(2); // 주문 수량
//        orderRepository.save(order);

        Long orderId = 1L;
        OrderEx order = orderRepository.findById(orderId).get();

        MemberEx member = order.getMember();
        ProductEx product = order.getProduct();

        System.out.println("member = " + member.getUsername());
        System.out.println("product = " + product.getName());
        System.out.println("orderAmount = " + order.getOrderAmount());
    }
}
