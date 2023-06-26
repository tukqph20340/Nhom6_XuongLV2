package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class HoaDonChiTietID implements Serializable {

    @Column(name = "id_hoa_don")
    private Long idCuaHoaDon;

    @Column(name = "id_sach")
    private Long idCuaSach;

}
