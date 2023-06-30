package com.example.demo.service;

import com.example.demo.model.TheLoai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface TheLoaiSevice {
    ArrayList<TheLoai> getAll();
    void delete(Long id);
    TheLoai detail(Long id);
    TheLoai add(TheLoai theLoai);
    TheLoai update(TheLoai theLoai);
    Page<TheLoai> phanTrang(Pageable pageable);
}
