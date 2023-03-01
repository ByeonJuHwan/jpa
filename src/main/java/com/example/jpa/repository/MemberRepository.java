package com.example.jpa.repository;

import com.example.jpa.example.MemberEx;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEx, String> {
}
