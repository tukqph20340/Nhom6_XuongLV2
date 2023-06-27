package com.example.demo.service;


import com.example.demo.model.NhaCungCap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface NhaCungCapSevice {
    ArrayList<NhaCungCap> getAll();
    void delete(Long id);
    NhaCungCap detail(Long id);
    NhaCungCap add(NhaCungCap nhaCungCap);
    NhaCungCap update(NhaCungCap nhaCungCap);
    Page<NhaCungCap> phanTrang(Pageable pageable);

}
