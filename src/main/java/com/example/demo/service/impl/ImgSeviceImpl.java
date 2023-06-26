package com.example.demo.service.impl;

import com.example.demo.model.Images;
import com.example.demo.repository.ImgRepository;
import com.example.demo.service.ImgSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ImgSeviceImpl implements ImgSevice {

    @Autowired
    ImgRepository repository;

    @Override
    public ArrayList<Images> getAll() {
        return (ArrayList<Images>) repository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Images detail(Integer id) {
        return null;
    }

    @Override
    public Images add(Images images) {
        return null;
    }

    @Override
    public Images update(Images images) {
        return null;
    }

    @Override
    public Page<Images> phanTrang(Pageable pageable) {
        return null;
    }
}
