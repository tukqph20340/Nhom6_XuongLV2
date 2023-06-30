package com.example.demo.service.impl;

import com.example.demo.model.HoaDonChiTiet;
import com.example.demo.repository.HoaDonChiTietRepository;
import com.example.demo.service.HoaDonChiTietSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class HoaDonChiTietSeviceImpl implements HoaDonChiTietSevice {
    @Autowired
    HoaDonChiTietRepository repository;

    @Override
    public ArrayList<HoaDonChiTiet> getAll() {
        return (ArrayList<HoaDonChiTiet>) repository.findAll();
    }
}
