package com.example.demo.service;

import com.example.demo.model.BanQuyen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface BanQuyenSevice {
    ArrayList<BanQuyen> getAll();
    void delete(Long id);
    BanQuyen detail(Long id);
    BanQuyen add(BanQuyen Voucher);
    BanQuyen update(BanQuyen Voucher);
    Page<BanQuyen> phanTrang(Pageable pageable);
}
