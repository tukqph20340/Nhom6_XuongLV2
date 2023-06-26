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
@Table(name = "tac_gia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TacGia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tac_gia")
    private Long idTacGia;

    @Column(name = "ma")
    private String ma;

    @Column(name = " ho_ten")
    private String hoVaTen;

    @Column(name = "ngay_sinh")
    private String ngaySinh;

}
