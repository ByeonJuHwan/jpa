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


    // 역방향
    @OneToMany(mappedBy = "member")
    private List<OrderEx> products = new ArrayList<>();
}
