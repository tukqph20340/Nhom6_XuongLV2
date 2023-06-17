package com.example.demo.service.impl;

import com.example.demo.model.DanhMucSach;
import com.example.demo.repository.DangMucSachReposity;
import com.example.demo.service.DanhMucSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class DanhMucSeviceImpl implements DanhMucSevice {

    @Autowired
    DangMucSachReposity reposity;

    @Override
    public ArrayList<DanhMucSach> getAll() {
        return (ArrayList<DanhMucSach>) reposity.findAll();
    }

    @Override
    public void delete(Integer id) {
        reposity.deleteById(id);
    }

    @Override
    public DanhMucSach detail(Integer id) {
        return reposity.getById(id);
    }

    @Override
    public DanhMucSach add(DanhMucSach danhMucSach) {
        return reposity.save(danhMucSach);
    }

    @Override
    public DanhMucSach update(DanhMucSach danhMucSach) {
        return reposity.save(danhMucSach);
    }

    @Override
    public Page<DanhMucSach> phanTrang(Pageable pageable) {
        return reposity.findAll(pageable);
    }
}
