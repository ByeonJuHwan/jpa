package com.example.jpa.example;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class MemberProductId implements Serializable {

    private String member; //MemberProduct.member와 연결
    private String product; //MemberProduct.product와 연결

    // hashCode 와 Equals 재정의

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberProductId that = (MemberProductId) o;
        return Objects.equals(member, that.member) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, product);
    }
}
