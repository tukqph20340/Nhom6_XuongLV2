package com.example.demo.service.impl;

import com.example.demo.model.NhaCungCap;
import com.example.demo.repository.NhaCungCapRepository;
import com.example.demo.service.NhaCungCapSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class NhaCungCapSeviceImpl implements NhaCungCapSevice {
    @Autowired
    NhaCungCapRepository repository;
    @Override
    public ArrayList<NhaCungCap> getAll() {
        return (ArrayList<NhaCungCap>) repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public NhaCungCap detail(Integer id) {
        return repository.getById(id);
    }

    @Override
    public NhaCungCap add(NhaCungCap nhaCungCap) {
        return repository.save(nhaCungCap);
    }

    @Override
    public NhaCungCap update(NhaCungCap nhaCungCap) {
        return repository.save(nhaCungCap);
    }

    @Override
    public Page<NhaCungCap> phanTrang(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
