package com.example.demo.repository;

import com.example.demo.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VoucherRepository extends JpaRepository<Voucher ,Long> {
}
