package com.example.Item.services;

import com.example.Item.domain.Coupons;
import com.example.Item.domain.Item;

import java.util.Optional;

public interface ICouponsService {

    Coupons save(Coupons coupons);
    Optional<Coupons> getById(Long id);
    void deleteById(Long id);
    Optional<Coupons> update(Long id, Coupons coupons);
}
