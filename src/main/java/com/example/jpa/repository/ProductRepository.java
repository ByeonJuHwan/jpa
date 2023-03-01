package com.example.jpa.repository;


import com.example.jpa.example.ProductEx;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEx,String> {
}
