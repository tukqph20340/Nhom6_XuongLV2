package com.example.demo.service;

import com.example.demo.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface KhachHangSevice {
    ArrayList<KhachHang> getAll();
    void delete(Long id);
    KhachHang detail(Long id);
    KhachHang add(KhachHang KhachHang);
    KhachHang update(KhachHang KhachHang);
    Page<KhachHang> phanTrang(Pageable pageable);
}
