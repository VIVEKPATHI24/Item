package com.example.Item.services;

import com.example.Item.domain.Brands;
import com.example.Item.domain.Item;

import java.util.Optional;

public interface IBrandsService {

    Brands save(Brands brands);
    Optional<Brands> getById(Long id);
    void deleteById(Long id);
    Optional<Brands> update(Long id, Brands brands);

}
