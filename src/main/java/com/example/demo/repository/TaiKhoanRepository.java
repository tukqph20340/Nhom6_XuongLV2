package com.example.demo.repository;

import com.example.demo.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan,Long> {
}
