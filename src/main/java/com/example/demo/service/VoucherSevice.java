package com.example.demo.service;

import com.example.demo.model.Voucher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface VoucherSevice {
    ArrayList<Voucher> getAll();
    void delete(Long id);
    Voucher detail(Long id);
    Voucher add(Voucher Voucher);
    Voucher update(Voucher Voucher);
    Page<Voucher> phanTrang(Pageable pageable);
}
