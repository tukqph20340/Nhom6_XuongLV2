package com.example.demo.service;

import com.example.demo.model.NhaXuatBan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface NhaXuatBanSevice {
    ArrayList<NhaXuatBan> getAll();
    void delete(Integer id);
    NhaXuatBan detail(Integer id);
    NhaXuatBan add(NhaXuatBan nhaXuatBan);
    NhaXuatBan update(NhaXuatBan nhaXuatBan);
    Page<NhaXuatBan> phanTrang(Pageable pageable);
}
