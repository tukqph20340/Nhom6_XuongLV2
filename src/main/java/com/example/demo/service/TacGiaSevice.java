package com.example.demo.service;

import com.example.demo.model.TacGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface TacGiaSevice {
    ArrayList<TacGia> getAll();
    void delete(Long id);
    TacGia detail(Long id);
    TacGia add(TacGia tacGia);
    TacGia update(TacGia tacGia);
    Page<TacGia> phanTrang(Pageable pageable);
}

