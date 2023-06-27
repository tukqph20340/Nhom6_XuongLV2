package com.example.demo.service.impl;

import com.example.demo.model.GiayPhep;
import com.example.demo.repository.GiayPhepRepository;
import com.example.demo.service.GiayPhepSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class GiayPhepSeviceImpl implements GiayPhepSevice {
    @Autowired
    GiayPhepRepository repository;
    @Override
    public ArrayList<GiayPhep> getAll() {
        return (ArrayList<GiayPhep>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public GiayPhep detail(Long id) {
        return  repository.getOne(id);
    }

    @Override
    public GiayPhep add(GiayPhep GiayPhep) {
        return  repository.save(GiayPhep);
    }

    @Override
    public GiayPhep update(GiayPhep GiayPhep) {
        return   repository.save(GiayPhep);
    }

    @Override
    public Page<GiayPhep> phanTrang(Pageable pageable) {
        return null;
    }
}
