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
@Table(name = "giay_phep")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GiayPhep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_giay_phep")
    private Long idGiayPhep;



    @Column(name = "ngay_het_han")
    @Temporal(TemporalType.DATE)
    private Date ngayHetHan;

    @Column(name = "so_giay_phep")
    private Integer soGiayPhep;

    @Column(name = "trang_thai")
    private Integer trangThai;

}
