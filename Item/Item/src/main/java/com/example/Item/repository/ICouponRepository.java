package com.example.Item.repository;

import com.example.Item.domain.Brands;
import com.example.Item.domain.Coupons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICouponRepository extends JpaRepository<Coupons, Long> {

}
