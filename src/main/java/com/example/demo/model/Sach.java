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
@Table(name = "sach")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sach")
    private Integer idSach;

   @ManyToOne
   @JoinColumn(name = "id_ncc")
   private NhaCungCap nhaCungCap;

    @ManyToOne
    @JoinColumn(name = "id_tac_gia")
    private TacGia tacGia;

    @ManyToOne
    @JoinColumn(name = " id_nxb")
    private NhaXuatBan nhaXuatBan;

    @ManyToOne
    @JoinColumn(name = " id_img")
    private Img img;


    @Column(name = "tieu_de")
    private String tieuDe;



    @Column(name = "ngay_xuat_ban")
    private String ngaySatBan;

    @Column(name = "gia_nhap")
    private Double giaNhap;

    @Column(name = "gia_ban")
    private Double giaBan;

    @Column(name = "so_luong")
    private Integer soLuong;


    @Column(name = "trang_thai")
    private Integer trangThai;
}
