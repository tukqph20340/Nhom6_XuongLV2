package com.example.demo.service.impl;

import com.example.demo.model.NhaXuatBan;
import com.example.demo.repository.NhaXuatbanRepository;
import com.example.demo.service.NhaXuatBanSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class NhaXuatBanSeviceImpl implements NhaXuatBanSevice {

    @Autowired
    NhaXuatbanRepository repository;
    @Override
    public ArrayList<NhaXuatBan> getAll() {
        return (ArrayList<NhaXuatBan>) repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public NhaXuatBan detail(Integer id) {
        return repository.getById(id);
    }

    @Override
    public NhaXuatBan add(NhaXuatBan nhaXuatBan) {
        return repository.save(nhaXuatBan);
    }

    @Override
    public NhaXuatBan update(NhaXuatBan nhaXuatBan) {
        return repository.save(nhaXuatBan);
    }

    @Override
    public Page<NhaXuatBan> phanTrang(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
