package com.example.demo.repository;


import com.example.demo.model.GiayPhep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GiayPhepRepository extends JpaRepository<GiayPhep,Long> {
}
