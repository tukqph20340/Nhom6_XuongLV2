package com.example.demo.service.impl;

import com.example.demo.model.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.NhanVienSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class NhanVienSeviceImpl implements NhanVienSevice {
    @Autowired
    NhanVienRepository repository;
    @Override
    public ArrayList<NhanVien> getAll() {
        return (ArrayList<NhanVien>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public NhanVien detail(Long id) {
        return  repository.getOne(id);
    }

    @Override
    public NhanVien add(NhanVien nhanVien) {
        return  repository.save(nhanVien);
    }

    @Override
    public NhanVien update(NhanVien nhanVien) {
        return repository.save(nhanVien);
    }

    @Override
    public Page<NhanVien> phanTrang(Pageable pageable) {
        return null;
    }
}
