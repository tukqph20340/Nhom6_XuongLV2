package com.example.demo.repository;

import com.example.demo.model.DanhMucSach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DangMucSachReposity extends JpaRepository<DanhMucSach,Integer> {
}
