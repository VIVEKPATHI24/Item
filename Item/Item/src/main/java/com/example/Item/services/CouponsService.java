package com.example.Item.services;

import com.example.Item.domain.Brands;
import com.example.Item.domain.Coupons;
import com.example.Item.domain.Item;
import com.example.Item.repository.ICouponRepository;
import com.example.Item.repository.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CouponsService implements ICouponsService {
    @Autowired
    ICouponRepository  iCouponRepository;

    @Override
    public Coupons save(Coupons coupons)
    {
        return iCouponRepository.save(coupons);
    }

    @Override
    public Optional<Coupons> getById(Long id) {
        return  iCouponRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        iCouponRepository.deleteById(id);
    }

    @Override
    public Optional<Coupons> update(Long id, Coupons coupons)
    {
        if(iCouponRepository.existsById(id))
        {
            iCouponRepository.save(coupons);
        }
        return null;
    }
}
