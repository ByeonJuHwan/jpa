package com.example.jpa.repository;

import com.example.jpa.example.OrderEx;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEx, Long> {
}
