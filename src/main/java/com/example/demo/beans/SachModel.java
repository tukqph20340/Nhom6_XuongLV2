package com.example.demo.beans;

import com.example.demo.model.NhaCungCap;
import com.example.demo.model.NhaXuatBan;
import com.example.demo.model.TacGia;
import com.example.demo.model.TheLoai;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SachModel {

    private Long idSach;
    private String fileAnh;
    private String tieuDe;
    private Double giaBan;
    private Integer soLuong;

}
