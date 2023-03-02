package com.example.jpa.example;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class ProductEx {

    @Id
    @Column(name = "PRODUCT_ID")
    private String id;

    private String name;
}