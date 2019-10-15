package com.example.Item.services;

import com.example.Item.domain.Brands;
import com.example.Item.domain.Item;
import com.example.Item.repository.IBrandRepository;
import com.example.Item.repository.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandsService implements IBrandsService {

    @Autowired
    IBrandRepository iBrandRepository;
    
    @Override
    public Brands save(Brands brands)
    {
        return iBrandRepository.save(brands);
    }

    @Override
    public Optional<Brands> getById(Long id) {
        return  iBrandRepository.findById(id);
    }

    @Override
    public void deleteById(Long id)
    {
        iBrandRepository.deleteById(id);
    }

    @Override
    public Optional<Brands> update(Long id, Brands brands)
    {
        if(iBrandRepository.existsById(id))
        {
            iBrandRepository.save(brands);
        }
        return null;
    }
}
