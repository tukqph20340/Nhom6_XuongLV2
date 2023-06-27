package com.example.demo.service.impl;

import com.example.demo.model.Sach;
import com.example.demo.repository.SachRepository;
import com.example.demo.service.SachSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class SachSeviceImpl implements SachSevice {
    @Autowired
    SachRepository repository;
    @Override
    public ArrayList<Sach> getAll() {
        return (ArrayList<Sach>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Sach detail(Long id) {
        return repository.getById(id);
    }

    @Override
    public Sach add(Sach sach) {
        return repository.save(sach);
    }

    @Override
    public Sach update(Sach sach) {
        return  repository.save(sach);
    }

    @Override
    public Page<Sach> phanTrang(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
