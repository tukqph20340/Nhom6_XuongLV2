package com.example.demo.service;

import com.example.demo.model.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.Optional;
public interface SachSevice {
    ArrayList<Sach> getAll();
    ArrayList<Sach> timKiem(Long id , String td);
    void delete(Long id);
    Sach detail(Long id);
    Sach add(Sach sach);
    Sach update(Sach sach);
    Page<Sach> phanTrang(Pageable pageable);
}
