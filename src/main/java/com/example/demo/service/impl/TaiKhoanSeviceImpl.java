package com.example.demo.service.impl;

import com.example.demo.model.TaiKhoan;
import com.example.demo.repository.TaiKhoanRepository;
import com.example.demo.service.TaiKhoanSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TaiKhoanSeviceImpl implements TaiKhoanSevice {
    @Autowired
    TaiKhoanRepository repository;

    @Override
    public ArrayList<TaiKhoan> getAll() {
        return (ArrayList<TaiKhoan>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
    repository.deleteById(id);
    }

    @Override
    public TaiKhoan detail(Long id) {
        return repository.getOne(id);
    }

    @Override
    public TaiKhoan add(TaiKhoan taiKhoan) {
        return repository.save(taiKhoan);
    }

    @Override
    public TaiKhoan update(TaiKhoan taiKhoan) {
        return repository.save(taiKhoan);
    }
}
