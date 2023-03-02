package com.example.jpa.example;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderEx {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberEx member; // MemberProductId.member 와 연결

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private ProductEx product; // MemberProductId.product 와 연결

    private int orderAmount;
}
