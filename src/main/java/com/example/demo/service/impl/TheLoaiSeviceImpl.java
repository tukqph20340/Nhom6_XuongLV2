package com.example.demo.service.impl;

import com.example.demo.model.TheLoai;
import com.example.demo.repository.TheLoaiRepository;
import com.example.demo.service.TheLoaiSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TheLoaiSeviceImpl implements TheLoaiSevice {
    @Autowired
    TheLoaiRepository repository;


    @Override
    public ArrayList<TheLoai> getAll() {
        return (ArrayList<TheLoai>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TheLoai detail(Long id) {
        return repository.getById(id);
    }

    @Override
    public TheLoai add(TheLoai theLoai) {
        return repository.save(theLoai);
    }

    @Override
    public TheLoai update(TheLoai theLoai) {
        return repository.save(theLoai);
    }

    @Override
    public Page<TheLoai> phanTrang(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
