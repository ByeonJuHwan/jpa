package com.example.jpa.example;


import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
public class MemberEx {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    @ManyToMany
    @JoinTable(name = "MEMBER_PRODUCT",
            joinColumns = @JoinColumn(name = "MEBMER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))
    private List<ProductEx> products = new ArrayList<>();

    public void addProduct(ProductEx product) {
        products.add(product);
        product.getMembers().add(this);
    }

}
