package com.example.jpa.controller;

import com.example.jpa.example.MemberEx;
import com.example.jpa.example.ProductEx;
import com.example.jpa.repository.MemberRepository;
import com.example.jpa.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ExampleMain {

    private final MemberRepository memberRepository;
    private final ProductRepository productRepository;

    @GetMapping("/")
    public void example() {
        ProductEx productA = new ProductEx();
        productA.setId("productA");
        productA.setName("상품A");
        productRepository.save(productA);

        MemberEx member1 = new MemberEx();
        member1.setId("member1");
        member1.setUsername("회원1");
        member1.addProduct(productA);
        memberRepository.save(member1);

        ProductEx products = productRepository.findById("productA").get();
        List<MemberEx> members = products.getMembers();
        for (MemberEx member : members) {
            System.out.println("member = " + member.getUsername());
        }
    }
}
