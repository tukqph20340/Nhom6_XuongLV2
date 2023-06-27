package com.example.demo.service.impl;

import com.example.demo.model.TacGia;
import com.example.demo.repository.TacGiaRepository;
import com.example.demo.service.TacGiaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TacGiaSeviceImpl implements TacGiaSevice {
    @Autowired
    TacGiaRepository repository;


    @Override
    public ArrayList<TacGia> getAll() {
        return (ArrayList<TacGia>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TacGia detail(Long id) {
        return repository.getById(id);
    }

    @Override
    public TacGia add(TacGia tacGia) {
        return repository.save(tacGia);
    }

    @Override
    public TacGia update(TacGia tacGia) {
        return repository.save(tacGia);
    }

    @Override
    public Page<TacGia> phanTrang(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
