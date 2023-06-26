package com.example.demo.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter


@Embeddable
public class GioHanChiTietID implements Serializable {

    @JoinColumn(name = "id_gio_hang")
    private Long idCuaGioHang;

    @JoinColumn(name = "id_sach")
    private Long idCuaSach;
}
