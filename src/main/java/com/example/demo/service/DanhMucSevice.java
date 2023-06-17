package com.example.demo.service;

import com.example.demo.model.DanhMucSach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface DanhMucSevice {
    ArrayList<DanhMucSach> getAll();
    void delete(Integer id);
    DanhMucSach detail(Integer id);
    DanhMucSach add(DanhMucSach danhMucSach);
    DanhMucSach update(DanhMucSach danhMucSach);
    Page<DanhMucSach> phanTrang(Pageable pageable);

}
