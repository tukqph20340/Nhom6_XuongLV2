package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ban_quyen")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BanQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ban_quyen")
    private Long idVoucher;

    @ManyToOne
    @JoinColumn(name = "id_sach")
    private Sach sach;

    @ManyToOne
    @JoinColumn(name = "id_giay_phep")
    private GiayPhep giayPhep;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ngay_bat_dau")
    @Temporal(TemporalType.DATE)
    private Date ngayBatdau;

    @Column(name = "ten_tac)gia")
    private String tenTacGia;

    @Column(name = "trang_thai")
    private Integer trangThai;

}
