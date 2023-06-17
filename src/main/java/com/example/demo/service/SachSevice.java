package com.example.demo.service;

import com.example.demo.model.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface SachSevice {
    ArrayList<Sach> getAll();
    void delete(Integer id);
    Sach detail(Integer id);
    Sach add(Sach sach);
    Sach update(Sach sach);
    Page<Sach> phanTrang(Pageable pageable);
}
