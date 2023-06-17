package com.example.demo.repository;

import com.example.demo.model.NhaXuatBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NhaXuatbanRepository extends JpaRepository<NhaXuatBan,Integer> {
}
