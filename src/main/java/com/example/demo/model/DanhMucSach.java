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
@Table(name = "danh_muc_sach")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DanhMucSach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_danh_muc_sach")
    private Integer idDanhMucSach;

    @ManyToOne
    @JoinColumn(name = "id_sach")
    private Sach sach;

    @ManyToOne
    @JoinColumn(name = "id_the_loai")
    private TheLoai theLoai;
}
