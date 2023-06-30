package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "gio_hang_chi_tiet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GioHangChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gio_hang_chi_tiet")
    private Long idGioHangChiTiet;

    @ManyToOne
    @JoinColumn(name = "id_gio_hang", nullable = false, insertable = false, updatable = false)
    private GioHang gioHang;

    @ManyToOne
    @JoinColumn(name = "id_sach",nullable = false, insertable = false, updatable = false)
    private Sach sach;

    @Column(name = "tong_gia_tien")
    private Double tongGiaTien;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public GioHangChiTiet(Sach sach, Double tongGiaTien, Integer soLuong, Integer trangThai) {
        this.sach = sach;
        this.tongGiaTien = tongGiaTien;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }
}
