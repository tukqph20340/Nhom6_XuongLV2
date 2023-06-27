package com.example.demo.service;

import com.example.demo.model.TaiKhoan;

import java.util.ArrayList;
public interface TaiKhoanSevice {
    ArrayList<TaiKhoan> getAll();

    void delete(Long id);

    TaiKhoan detail(Long id);

    TaiKhoan add(TaiKhoan taiKhoan);

    TaiKhoan update(TaiKhoan taiKhoan);

}
