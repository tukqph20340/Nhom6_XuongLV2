package com.example.demo.service;

import com.example.demo.model.TacGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface TacGiaSevice {
    ArrayList<TacGia> getAll();
    void delete(Integer id);
    TacGia detail(Integer id);
    TacGia add(TacGia tacGia);
    TacGia update(TacGia tacGia);
    Page<TacGia> phanTrang(Pageable pageable);
}

