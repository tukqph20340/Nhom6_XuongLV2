package com.example.demo.service;

import com.example.demo.model.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface NhanVienSevice {
    ArrayList<NhanVien> getAll();
    void delete(Long id);
    NhanVien detail(Long id);
    NhanVien add(NhanVien nhanVien);
    NhanVien update(NhanVien nhanVien);
    Page<NhanVien> phanTrang(Pageable pageable);
}
