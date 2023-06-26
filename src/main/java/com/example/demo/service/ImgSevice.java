package com.example.demo.service;

import com.example.demo.model.Images;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface ImgSevice {
    ArrayList<Images> getAll();
    void delete(Integer id);
    Images detail(Integer id);
    Images add(Images images);
    Images update(Images images);
    Page<Images> phanTrang(Pageable pageable);

}
