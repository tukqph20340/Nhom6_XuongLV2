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
@Table(name = "images_product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Img {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_img")
    private Long idImg;

    @Column(name = "images")
    private String img;

}
