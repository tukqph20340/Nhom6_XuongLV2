package com.example.demo.controller;

import com.example.demo.model.HoaDonChiTiet;
import com.example.demo.model.NhaCungCap;
import com.example.demo.model.NhaXuatBan;
import com.example.demo.model.Sach;
import com.example.demo.model.TacGia;
import com.example.demo.model.TheLoai;
import com.example.demo.service.HoaDonChiTietSevice;
import com.example.demo.service.NhaCungCapSevice;
import com.example.demo.service.NhaXuatBanSevice;
import com.example.demo.service.SachSevice;
import com.example.demo.service.TacGiaSevice;
import com.example.demo.service.TheLoaiSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
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
    TheLoaiSevice theLoaiSevice;

    @Autowired
    HoaDonChiTietSevice hoaDonChiTietSevice;


    @GetMapping("san-pham/hien-thi")
    public String viewAdd(Model model,@RequestParam(defaultValue = "0", name = "page") Integer number) {
        ArrayList<TacGia> listTG = tacGiaSevice.getAll();
        ArrayList<NhaCungCap> listNCC = nhaCungCapS.getAll();
        ArrayList<NhaXuatBan> listNXB = nhaXuatBanSevice.getAll();
        ArrayList<TheLoai> listTL = theLoaiSevice.getAll();
        Pageable pageable = PageRequest.of(number, 4);
        Page<Sach> list = sevice.phanTrang(pageable);
        model.addAttribute("list", list);
        model.addAttribute("listTG", listTG);
        model.addAttribute("listNCC", listNCC);
        model.addAttribute("listNXB", listNXB);
        model.addAttribute("listTl", listTL);
        return "/admin/sanpham/san-pham";
    }

    @GetMapping("san-pham/delete")
    public String delete(Model model, @RequestParam("id") Long id) {
        sevice.delete(id);
        return "redirect:/admin/san-pham/hien-thi";
    }

    @GetMapping("san-pham/viewUpdate")
    public String viewUpdate(Model model, @RequestParam("id") Long id) {
        ArrayList<TacGia> listTG = tacGiaSevice.getAll();
        ArrayList<NhaCungCap> listNCC = nhaCungCapS.getAll();
        ArrayList<NhaXuatBan> listNXB = nhaXuatBanSevice.getAll();
        ArrayList<TheLoai> listTL = theLoaiSevice.getAll();

        Sach detail = sevice.detail(id);

        model.addAttribute("listTG", listTG);
        model.addAttribute("listNCC", listNCC);
        model.addAttribute("listNXB", listNXB);
        model.addAttribute("listTl", listTL);
        model.addAttribute("detail", detail);
        return "/admin/sanpham/update-san-pham";
    }

    @PostMapping("san-pham/add")
    public String add(Model model, @RequestParam("tenNhaCungCap") Long tenNhaCungCap
            , @RequestParam("tenTacGia") Long tenTacGia
            , @RequestParam("tenNhaXuatBan") Long tenNhaXuatBan
            , @RequestParam("theLoai") Long theLoai
            , @RequestParam("linkAnh") String linkAnh
            , @RequestParam("tieuDe") String tieuDe
            , @RequestParam("ngayXuatBan") String ngayXuatBan
            , @RequestParam("giaBan") Double giaBan
            , @RequestParam("giaNhap") Double giaNhap
            , @RequestParam("soLuong") Integer soLuong
            , @RequestParam("moTa") String moTa
    ) {
        if (soLuong > 0) {
            Sach sach = new Sach();
            NhaCungCap ncc = new NhaCungCap();
            ncc.setIdNhaCungCap(tenNhaCungCap);
            sach.setNhaCungCap(ncc);

            TacGia tg = new TacGia();
            tg.setIdTacGia(tenTacGia);
            sach.setTacGia(tg);


            NhaXuatBan nxb = new NhaXuatBan();
            nxb.setIdNhaXuatBan(tenNhaXuatBan);
            sach.setNhaXuatBan(nxb);


            TheLoai theLoai1 = new TheLoai();
            theLoai1.setIdTheLoai(theLoai);
            sach.setTheLoai(theLoai1);


            sach.setFileAnh(linkAnh);
            sach.setTieuDe(tieuDe);
            sach.setNgayXuatBan(ngayXuatBan);
            sach.setGiaBan(giaBan);
            sach.setGiaNhap(giaNhap);
            sach.setSoLuong(soLuong);
            sach.setMoTa(moTa);
            sach.setTrangThai(1);
            sevice.add(sach);
            return "redirect:/admin/san-pham/hien-thi";
        } else {
            Sach sach = new Sach();
            NhaCungCap ncc = new NhaCungCap();
            ncc.setIdNhaCungCap(tenNhaCungCap);
            sach.setNhaCungCap(ncc);

            TacGia tg = new TacGia();
            tg.setIdTacGia(tenTacGia);
            sach.setTacGia(tg);


            NhaXuatBan nxb = new NhaXuatBan();
            nxb.setIdNhaXuatBan(tenNhaXuatBan);
            sach.setNhaXuatBan(nxb);


            TheLoai theLoai1 = new TheLoai();
            theLoai1.setIdTheLoai(theLoai);
            sach.setTheLoai(theLoai1);

            sach.setFileAnh(linkAnh);
            sach.setTieuDe(tieuDe);
            sach.setNgayXuatBan(ngayXuatBan);
            sach.setGiaBan(giaBan);
            sach.setGiaNhap(giaNhap);
            sach.setSoLuong(soLuong);
            sach.setMoTa(moTa);
            sach.setTrangThai(0);
            sevice.add(sach);
            return "redirect:/admin/san-pham/hien-thi";
        }
    }


    @PostMapping("san-pham/update")
    public String update(Model model,
                         @RequestParam("id") Long id,
                         @RequestParam("tenNhaCungCap") Long tenNhaCungCap
            , @RequestParam("tenTacGia") Long tenTacGia
            , @RequestParam("tenNhaXuatBan") Long tenNhaXuatBan
            , @RequestParam("theLoai") Long theLoai
            , @RequestParam("linkAnh") String linkAnh
            , @RequestParam("tieuDe") String tieuDe
            , @RequestParam("ngayXuatBan") String ngayXuatBan
            , @RequestParam("giaBan") Double giaBan
            , @RequestParam("giaNhap") Double giaNhap
            , @RequestParam("soLuong") Integer soLuong
            , @RequestParam("moTa") String moTa
    ) {
        if (soLuong > 0) {
            Sach sach = sevice.detail(id);
            NhaCungCap ncc = new NhaCungCap();
            ncc.setIdNhaCungCap(tenNhaCungCap);
            sach.setNhaCungCap(ncc);

            TacGia tg = new TacGia();
            tg.setIdTacGia(tenTacGia);
            sach.setTacGia(tg);


            NhaXuatBan nxb = new NhaXuatBan();
            nxb.setIdNhaXuatBan(tenNhaXuatBan);
            sach.setNhaXuatBan(nxb);


            TheLoai theLoai1 = new TheLoai();
            theLoai1.setIdTheLoai(theLoai);
            sach.setTheLoai(theLoai1);


            sach.setFileAnh(linkAnh);
            sach.setTieuDe(tieuDe);
            sach.setNgayXuatBan(ngayXuatBan);
            sach.setGiaBan(giaBan);
            sach.setGiaNhap(giaNhap);
            sach.setSoLuong(soLuong);
            sach.setMoTa(moTa);
            sach.setTrangThai(1);
            sevice.add(sach);
            return "redirect:/admin/san-pham/hien-thi";
        } else {
            Sach sach = sevice.detail(id);
            NhaCungCap ncc = new NhaCungCap();
            ncc.setIdNhaCungCap(tenNhaCungCap);
            sach.setNhaCungCap(ncc);

            TacGia tg = new TacGia();
            tg.setIdTacGia(tenTacGia);
            sach.setTacGia(tg);


            NhaXuatBan nxb = new NhaXuatBan();
            nxb.setIdNhaXuatBan(tenNhaXuatBan);
            sach.setNhaXuatBan(nxb);


            TheLoai theLoai1 = new TheLoai();
            theLoai1.setIdTheLoai(theLoai);
            sach.setTheLoai(theLoai1);

            sach.setFileAnh(linkAnh);
            sach.setTieuDe(tieuDe);
            sach.setNgayXuatBan(ngayXuatBan);
            sach.setGiaBan(giaBan);
            sach.setGiaNhap(giaNhap);
            sach.setSoLuong(soLuong);
            sach.setMoTa(moTa);
            sach.setTrangThai(0);
            sevice.add(sach);
            return "redirect:/admin/san-pham/hien-thi";
        }
    }


    @GetMapping("tac-gia/hien-thi")
    public String tacGia(Model model) {
        ArrayList<TacGia> listTG = tacGiaSevice.getAll();

        model.addAttribute("list", listTG);

        return "/admin/tacgia/tac-gia";
    }

    @GetMapping("tac-gia/delete")
    public String deleteTG(Model model, @RequestParam("id") Long id) {
        tacGiaSevice.delete(id);
        return "redirect:/admin/tac-gia/hien-thi";
    }

    @GetMapping("tac-gia/viewUpdate")
    public String viewUpdatetg(Model model, @RequestParam("id") Long id) {

        TacGia detail = tacGiaSevice.detail(id);
        model.addAttribute("detail", detail);
        return "/admin/tacgia/update-tac-gia";
    }

    @PostMapping("tac-gia/add")
    public String add(Model model
            , @RequestParam("hoVaTen") String hoVaTen
            , @RequestParam("ngaySinh") String ngaySinh
    ) {


        TacGia tg = new TacGia();
        tg.setHoVaTen(hoVaTen);
        tg.setNgaySinh(ngaySinh);
        tacGiaSevice.add(tg);
        return "redirect:/admin/tac-gia/hien-thi";

    }


    @PostMapping("tac-gia/update")
    public String update(Model model,
                         @RequestParam("id") Long id
            , @RequestParam("hoVaTen") String hoVaTen
            , @RequestParam("ngaySinh") String ngaySinh
    ) {


        TacGia tg = tacGiaSevice.detail(id);
        tg.setHoVaTen(hoVaTen);
        tg.setNgaySinh(ngaySinh);
        tacGiaSevice.update(tg);
        return "redirect:/admin/tac-gia/hien-thi";

    }

    @GetMapping("nha-cung-cap/hien-thi")
    public String nhaCungCap(Model model) {
        ArrayList<NhaCungCap> list = nhaCungCapS.getAll();

        model.addAttribute("list", list);

        return "/admin/nhacungcap/nha-cung-cap";
    }

    @GetMapping("nha-cung-cap/delete")
    public String nhaCungCapdeleteTG(Model model, @RequestParam("id") Long id) {
        nhaCungCapS.delete(id);
        return "redirect:/admin/nha-cung-cap/hien-thi";
    }

    @GetMapping("nha-cung-cap/viewUpdate")
    public String nhaCungCapviewUpdatetg(Model model, @RequestParam("id") Long id) {

        NhaCungCap detail = nhaCungCapS.detail(id);
        model.addAttribute("detail", detail);
        return "/admin/nhacungcap/update-nha-cung-cap";
    }

    @PostMapping("nha-cung-cap/add")
    public String nhaCungCapadd(Model model
            , @RequestParam("ten") String ten
            , @RequestParam("diaChi") String diaChi,
                                @RequestParam("sdt") String sdt
            , @RequestParam("email") String email
            , @RequestParam("trangThai") Integer trangThai

    ) {


        NhaCungCap tg = new NhaCungCap();
        tg.setTen(ten);
        tg.setDiaChi(diaChi);
        tg.setSdt(sdt);
        tg.setEmail(email);
        tg.setTrangThai(trangThai);
        nhaCungCapS.add(tg);
        return "redirect:/admin/nha-cung-cap/hien-thi";

    }


    @PostMapping("nha-cung-cap/update")
    public String nhaCungCapupdate(Model model,
                                   @RequestParam("id") Long id
            , @RequestParam("ten") String ten
            , @RequestParam("diaChi") String diaChi,
                                   @RequestParam("sdt") String sdt
            , @RequestParam("email") String email
            , @RequestParam("trangThai") Integer trangThai

    ) {


        NhaCungCap tg = nhaCungCapS.detail(id);
        tg.setTen(ten);
        tg.setDiaChi(diaChi);
        tg.setSdt(sdt);
        tg.setEmail(email);
        tg.setTrangThai(trangThai);
        nhaCungCapS.add(tg);
        return "redirect:/admin/nha-cung-cap/hien-thi";

    }


    @GetMapping("nha-xuat-ban/hien-thi")
    public String nhaXuatban(Model model) {
        ArrayList<NhaXuatBan> list = nhaXuatBanSevice.getAll();

        model.addAttribute("list", list);

        return "/admin/nhaxuatban/nha-xuat-ban";
    }

    @GetMapping("nha-xuat-ban/delete")
    public String nhaXuatbandeleteTG(Model model, @RequestParam("id") Long id) {
        nhaXuatBanSevice.delete(id);
        return "redirect:/admin/nha-xuat-ban/hien-thi";
    }

    @GetMapping("nha-xuat-ban/viewUpdate")
    public String nhaXuatbanviewUpdatetg(Model model, @RequestParam("id") Long id) {

        NhaXuatBan detail = nhaXuatBanSevice.detail(id);
        model.addAttribute("detail", detail);
        return "/admin/nhaxuatban/update-nha-xuat-ban";
    }

    @PostMapping("nha-xuat-ban/add")
    public String nhaXuatbanadd(Model model
            , @RequestParam("ten") String ten
            , @RequestParam("diaChi") String diaChi,
                                @RequestParam("sdt") String sdt
            , @RequestParam("trangThai") Integer trangThai

    ) {


        NhaXuatBan tg = new NhaXuatBan();
        tg.setTen(ten);
        tg.setDiaChi(diaChi);
        tg.setSdt(sdt);
        tg.setTrangThai(trangThai);
        nhaXuatBanSevice.add(tg);
        return "redirect:/admin/nha-xuat-ban/hien-thi";

    }


    @PostMapping("nha-xuat-ban/update")
    public String nhaXuatbanCapupdate(Model model,
                                      @RequestParam("id") Long id
            , @RequestParam("ten") String ten
            , @RequestParam("diaChi") String diaChi,
                                      @RequestParam("sdt") String sdt
            , @RequestParam("trangThai") Integer trangThai

    ) {


        NhaXuatBan tg = nhaXuatBanSevice.detail(id);
        tg.setTen(ten);
        tg.setDiaChi(diaChi);
        tg.setSdt(sdt);
        tg.setTrangThai(trangThai);
        nhaXuatBanSevice.add(tg);
        return "redirect:/admin/nha-xuat-ban/hien-thi";

    }
    @GetMapping("the-loai/hien-thi")
    public String theLoai(Model model) {
        ArrayList<TheLoai> list = theLoaiSevice.getAll();

        model.addAttribute("list", list);

        return "/admin/theloai/the-loai";
    }

    @GetMapping("the-loai/delete")
    public String theLoaideleteTG(Model model, @RequestParam("id") Long id) {
        theLoaiSevice.delete(id);
        return "redirect:/admin/the-loai/hien-thi";
    }

    @GetMapping("the-loai/viewUpdate")
    public String theLoaiUpdatetg(Model model, @RequestParam("id") Long id) {

        TheLoai detail = theLoaiSevice.detail(id);
        model.addAttribute("detail", detail);
        return "/admin/theloai/update-the-loai";
    }

    @PostMapping("the-loai/add")
    public String theLoaiadd(Model model
            , @RequestParam("ten") String ten


    ) {


        TheLoai tg = new TheLoai();
        tg.setTen(ten);
        theLoaiSevice.add(tg);
        return "redirect:/admin/the-loai/hien-thi";

    }


    @PostMapping("the-loai/update")
    public String theLoaiCapupdate(Model model,
                                      @RequestParam("id") Long id
            , @RequestParam("ten") String ten


    ) {


        TheLoai tg = theLoaiSevice.detail(id);
        tg.setTen(ten);

        theLoaiSevice.add(tg);
        return "redirect:/admin/the-loai/hien-thi";

    }

    @GetMapping("hoa-don-chi-tiet/hien-thi")
    public String hoaDonChiTiet(Model model) {
        ArrayList<HoaDonChiTiet> list = hoaDonChiTietSevice.getAll();

        model.addAttribute("list", list);

        return "/admin/hoadonchitiet/hoa-don-chi-tiet";
    }

    @GetMapping("san-pham/tim-kiem")
    public String timKiem(Model model,@RequestParam("idSach") String id,
                          @RequestParam("ten") String ten) {

             if(id.isEmpty() && ten.isEmpty()){
                 return "redirect:/admin/san-pham/hien-thi";
             }
             ArrayList<Sach> list = sevice.timKiem(Long.valueOf(id),ten);
             model.addAttribute("list", list);
             return "/admin/sanpham/tim-kiem";
        }
    }


