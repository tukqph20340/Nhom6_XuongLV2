package com.example.demo.service.impl;

import com.example.demo.model.KhachHang;
import com.example.demo.repository.KhachHangRepository;
import com.example.demo.service.KhachHangSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class KhachHangSeviceImpl implements KhachHangSevice {
    @Autowired
    KhachHangRepository repository;
    @Override
    public ArrayList<KhachHang> getAll() {
        return (ArrayList<KhachHang>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public KhachHang detail(Long id) {
        return repository.getOne(id);
    }

    @Override
    public KhachHang add(KhachHang KhachHang) {
        return repository.save(KhachHang);
    }

    @Override
    public KhachHang update(KhachHang KhachHang) {
        return repository.save(KhachHang);
    }

    @Override
    public Page<KhachHang> phanTrang(Pageable pageable) {
        return null;
    }
}
