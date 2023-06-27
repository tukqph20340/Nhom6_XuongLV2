package com.example.demo.service.impl;

import com.example.demo.model.BanQuyen;
import com.example.demo.repository.BanQuyenRepository;
import com.example.demo.service.BanQuyenSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class BanQuyenSeviceImpl implements BanQuyenSevice {
    @Autowired
    BanQuyenRepository repository;

    @Override
    public ArrayList<BanQuyen> getAll() {
        return (ArrayList<BanQuyen>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public BanQuyen detail(Long id) {
        return  repository.getOne(id);
    }

    @Override
    public BanQuyen add(BanQuyen Voucher) {
        return  repository.save(Voucher);
    }

    @Override
    public BanQuyen update(BanQuyen Voucher) {
        return repository.save(Voucher);
    }

    @Override
    public Page<BanQuyen> phanTrang(Pageable pageable) {
        return null;
    }
}
