package com.example.demo.service.impl;

import com.example.demo.model.Voucher;
import com.example.demo.repository.VoucherRepository;
import com.example.demo.service.VoucherSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class VoucherSeviceImpl implements VoucherSevice {
    @Autowired
    VoucherRepository repository;
    @Override
    public ArrayList<Voucher> getAll() {
        return (ArrayList<Voucher>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Voucher detail(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Voucher add(Voucher Voucher) {
        return repository.save(Voucher);
    }

    @Override
    public Voucher update(Voucher Voucher) {
        return repository.save(Voucher);
    }

    @Override
    public Page<Voucher> phanTrang(Pageable pageable) {
        return null;
    }
}
