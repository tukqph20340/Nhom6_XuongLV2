package com.example.demo.controller;

import com.example.demo.model.Images;
import com.example.demo.model.NhaCungCap;
import com.example.demo.model.NhaXuatBan;
import com.example.demo.model.Sach;
import com.example.demo.model.TacGia;
import com.example.demo.service.ImgSevice;
import com.example.demo.service.NhaCungCapSevice;
import com.example.demo.service.NhaXuatBanSevice;
import com.example.demo.service.SachSevice;
import com.example.demo.service.TacGiaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
@Controller
@RequestMapping("/admin/")
public class SachController {

    @Autowired
    SachSevice sevice;

    @Autowired
    TacGiaSevice tacGiaSevice;



    @Autowired
    NhaCungCapSevice nhaCungCapS;


    @Autowired
    NhaXuatBanSevice nhaXuatBanSevice;


    @Autowired
    ImgSevice imgSevice;



    @GetMapping("san-pham")
    public  String viewAdd(Model model){
        ArrayList<TacGia> listTG = tacGiaSevice.getAll();
        ArrayList<NhaCungCap> listNCC = nhaCungCapS.getAll();
        ArrayList<NhaXuatBan> listNXB = nhaXuatBanSevice.getAll();
        ArrayList<Images> listImg = imgSevice.getAll();
        ArrayList<Sach> list = sevice.getAll();
        model.addAttribute("list",list);
        model.addAttribute("listTG",listTG);
        model.addAttribute("listNCC",listNCC);
        model.addAttribute("listNXB",listNXB);
        model.addAttribute("listImg",listImg);
        return "/admin/sanpham/san-pham";
    }

    @GetMapping("delete")
    public  String delete(Model model, @RequestParam("id") Integer id){
        sevice.delete(id);
        return "redirect:/admin/san-pham";
    }

//    @PostMapping("add")
//    public  String add(Model model, @RequestParam("tenNhaCungCap") Integer tenNhaCungCap
//            , @RequestParam("tenTacGia") Integer tenTacGia
//            , @RequestParam("tenNhaSanXuat") Integer tenNhaSanXuat
//            , @RequestParam("tieuDe") String tieuDe
//            , @RequestParam("ngayXuatBan") String ngayXuatBan
//            , @RequestParam("giaBan") Double giaBan
//            , @RequestParam("giaNhap") Double giaNhap
//            , @RequestParam("soLuong") Integer soLuong
//            ){
//        if(soLuong>0) {
//            Sach sach = new Sach();
//            NhaCungCap ncc = new NhaCungCap();
//            ncc.setIdNhaCungCap(tenNhaCungCap);
//            TacGia tg = new TacGia();
//            tg.setIdTacGia(tenTacGia);
//            NhaXuatBan nxb = new NhaXuatBan();
//            nxb.setIdNhaXuatBan(tenNhaSanXuat);
//            sach.setTieuDe(tieuDe);
//            sach.setNgaySatBan(ngayXuatBan);
//            sach.setGiaBan(giaBan);
//            sach.setGiaNhap(giaNhap);
//            sach.setSoLuong(soLuong);
//            sach.setTrangThai(1);
//            return "redirect:/admin/san-pham";
//        }else {
//            Sach sach = new Sach();
//            NhaCungCap ncc = new NhaCungCap();
//            ncc.setIdNhaCungCap(tenNhaCungCap);
//            TacGia tg = new TacGia();
//            tg.setIdTacGia(tenTacGia);
//            NhaXuatBan nxb = new NhaXuatBan();
//            nxb.setIdNhaXuatBan(tenNhaSanXuat);
//            sach.setTieuDe(tieuDe);
//            sach.setNgaySatBan(ngayXuatBan);
//            sach.setGiaBan(giaBan);
//            sach.setGiaNhap(giaNhap);
//            sach.setSoLuong(soLuong);
//            sach.setTrangThai(0);
//            return "redirect:/admin/san-pham";
//        }
//    }

}
