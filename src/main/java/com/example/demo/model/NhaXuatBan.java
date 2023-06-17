package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "nha_xuat_ban")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NhaXuatBan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nxb")
    private Integer idNhaXuatBan;

    @Column(name = "ten")
    private String ten;


    @Column(name = "dia_chi")
    private String diaChi;


    @Column(name = "sdt")
    private String sdt;


    @Column(name = "trang_thai")
    private Integer trangThai;



}
