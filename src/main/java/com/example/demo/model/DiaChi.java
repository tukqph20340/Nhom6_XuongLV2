package com.example.demo.model;


import jakarta.persistence.Column;
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
@Table(name = "dia_chi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dia_chi")
    private Long idDiaChi;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private KhachHang khachHang;

    @Column(name = "ma")
    private String ma;

    @Column(name = "tenNguoiNhan")
    private String ten;


    @Column(name = "dia_chi")
    private String diaChi;


    @Column(name = "thanhPho")
    private String thanhPho;

    @Column(name = "quocGia")
    private String quocGia;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "trang_thai")
    private Integer trangThai;

}
