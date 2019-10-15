package com.example.Item.repository;

import com.example.Item.domain.Brands;
import com.example.Item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<Brands, Long> {


}
