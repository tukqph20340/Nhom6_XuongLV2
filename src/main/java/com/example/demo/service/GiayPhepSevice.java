package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
public interface GiayPhepSevice {
    ArrayList<GiayPhep> getAll();
    void delete(Long id);
    GiayPhep detail(Long id);
    GiayPhep add(GiayPhep GiayPhep);
    GiayPhep update(GiayPhep GiayPhep);
    Page<GiayPhep> phanTrang(Pageable pageable);
}
