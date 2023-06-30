package com.example.demo.repository;

import com.example.demo.model.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface SachRepository extends JpaRepository<Sach, Long> {
    ArrayList<Sach> findByIdSachOrTieuDe(Long id, String tieuDe);

}
