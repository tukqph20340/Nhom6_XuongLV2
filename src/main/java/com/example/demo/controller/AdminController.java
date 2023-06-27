package com.example.demo.controller;


import com.example.demo.model.BanQuyen;
import com.example.demo.model.GiayPhep;
import com.example.demo.model.KhachHang;
import com.example.demo.model.NhanVien;
import com.example.demo.model.Sach;
import com.example.demo.model.TacGia;
import com.example.demo.model.TaiKhoan;
import com.example.demo.model.Voucher;
import com.example.demo.service.BanQuyenSevice;
import com.example.demo.service.GiayPhepSevice;
import com.example.demo.service.KhachHangSevice;
import com.example.demo.service.NhanVienSevice;
import com.example.demo.service.SachSevice;
import com.example.demo.service.TacGiaSevice;
import com.example.demo.service.TaiKhoanSevice;
import com.example.demo.service.VoucherSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
@Controller
@RequestMapping("/admin/")
public class AdminController {

    @Autowired
    TaiKhoanSevice seviceTK;

    @Autowired
    NhanVienSevice seviceNV;

    @Autowired
    KhachHangSevice seviceKH;

    @Autowired
    GiayPhepSevice seviceGP;

    @Autowired
    VoucherSevice seviceVC;

    @Autowired
    BanQuyenSevice seviceBQ;

    @Autowired
    SachSevice sevice;

    @Autowired
    TacGiaSevice tacGiaSevice;


    @GetMapping("hien-thi")
    public String hienThi(Model model) {
        return "/admin/trang-chu";
    }

    @GetMapping("tai-khoan/hien-thi")
    public String taiKhoan(Model model) {
        ArrayList<TaiKhoan> listTk = seviceTK.getAll();
        model.addAttribute("listTk", listTk);
        return "/admin/taikhoan/tai-khoan";
    }

    @GetMapping("tai-khoan/delete")
    public String delete(Model model, @RequestParam("id") Long id) {
        seviceTK.delete(id);
        return "redirect:/admin/tai-khoan/hien-thi";
    }

    @GetMapping("tai-khoan/viewUpdate")
    public String viewUpdate(Model model, @RequestParam("id") Long id) {
        TaiKhoan detail = seviceTK.detail(id);
        model.addAttribute("detail", detail);
        return "/admin/taikhoan/update-tai-khoan";
    }

    @PostMapping("tai-khoan/add")
    public String taiKhoanAdd(Model model, @RequestParam("usename") String usename,
                              @RequestParam("password") String password,
                              @RequestParam("email") String email,
                              @RequestParam("sdt") String sdt,
                              @RequestParam("ntc") String ntc) {
        TaiKhoan tk = new TaiKhoan();
        tk.setUsename(usename);
        tk.setPassword(password);
        tk.setEmail(email);
        tk.setSdt(sdt);
        tk.setNguoiTruyCap(ntc);
        seviceTK.add(tk);
        return "redirect:/admin/tai-khoan/hien-thi";
    }


    @PostMapping("tai-khoan/update")
    public String update(Model model, @RequestParam("id") Long id,
                         @RequestParam("usename") String usename,
                         @RequestParam("password") String password,
                         @RequestParam("email") String email,
                         @RequestParam("sdt") String sdt,
                         @RequestParam("ntc") String ntc) {
        TaiKhoan tk = seviceTK.detail(id);
        tk.setUsename(usename);
        tk.setPassword(password);
        tk.setEmail(email);
        tk.setSdt(sdt);
        tk.setNguoiTruyCap(ntc);
        seviceTK.add(tk);
        return "redirect:/admin/tai-khoan/hien-thi";
    }


    @GetMapping("nhan-vien/hien-thi")
    public String nhanVien(Model model) {
        ArrayList<NhanVien> listNV = seviceNV.getAll();
        model.addAttribute("list", listNV);
        return "/admin/nhanvien/nhan-vien";
    }

    @GetMapping("nhan-vien/delete")
    public String deleteNV(Model model, @RequestParam("id") Long id) {
        seviceNV.delete(id);
        return "redirect:/admin/nhan-vien/hien-thi";
    }

    @GetMapping("nhan-vien/viewUpdate")
    public String viewUpdateNV(Model model, @RequestParam("id") Long id) {
        NhanVien listNV = seviceNV.detail(id);
        model.addAttribute("detail", listNV);
        return "/admin/nhanvien/update-nhan-vien";
    }

    @PostMapping("nhan-vien/add")
    public String nhanVienAdd(Model model, @RequestParam("hoVaTen") String hoVaTen,
                              @RequestParam("email") String email,
                              @RequestParam("sdt") String sdt,
                              @RequestParam("gioiTinh") String gioiTinh,
                              @RequestParam("ngaySinh") Date ngaySinh,
                              @RequestParam("diaChi") String diaChi,
                              @RequestParam("trangThai") Integer trangThai) {
        NhanVien nv = new NhanVien();
        nv.setHoTen(hoVaTen);
        nv.setEmail(email);
        nv.setSdt(sdt);
        nv.setGioiTinh(gioiTinh);
        nv.setNgaySinh(ngaySinh);
        nv.setDiaChi(diaChi);
        nv.setTrangThai(trangThai);
        seviceNV.add(nv);
        return "redirect:/admin/nhan-vien/hien-thi";
    }

    @PostMapping("nhan-vien/update")
    public String nhanVienupdate(Model model, @RequestParam("hoVaTen") String hoVaTen,
                                 @RequestParam("id") Long id,
                                 @RequestParam("email") String email,
                                 @RequestParam("sdt") String sdt,
                                 @RequestParam("gioiTinh") String gioiTinh,
                                 @RequestParam("ngaySinh") Date ngaySinh,
                                 @RequestParam("diaChi") String diaChi,
                                 @RequestParam("trangThai") Integer trangThai) {
        NhanVien nv = seviceNV.detail(id);
        nv.setHoTen(hoVaTen);
        nv.setEmail(email);
        nv.setSdt(sdt);
        nv.setGioiTinh(gioiTinh);
        nv.setNgaySinh(ngaySinh);
        nv.setDiaChi(diaChi);
        nv.setTrangThai(trangThai);
        seviceNV.add(nv);
        return "redirect:/admin/nhan-vien/hien-thi";
    }


    @GetMapping("khach-hang/hien-thi")
    public String khachHang(Model model) {
        ArrayList<KhachHang> listNV = seviceKH.getAll();
        model.addAttribute("list", listNV);
        return "/admin/khachhang/khach-hang";
    }

    @GetMapping("khach-hang/delete")
    public String deleteKH(Model model, @RequestParam("id") Long id) {
        seviceKH.delete(id);
        return "redirect:/admin/khach-hang/hien-thi";
    }

    @GetMapping("khach-hang/viewUpdate")
    public String viewUpdateKH(Model model, @RequestParam("id") Long id) {
        KhachHang listNV = seviceKH.detail(id);
        model.addAttribute("detail", listNV);
        return "/admin/khachhang/update-khach-hang";
    }

    @PostMapping("khach-hang/add")
    public String khachHangAdd(Model model, @RequestParam("hoVaTen") String hoVaTen,
                               @RequestParam("email") String email,
                               @RequestParam("sdt") String sdt,
                               @RequestParam("gioiTinh") Integer gioiTinh
    ) {
        KhachHang kh = new KhachHang();
        kh.setHoTen(hoVaTen);
        kh.setEmail(email);
        kh.setSdt(sdt);
        kh.setGioiTinh(gioiTinh);

        seviceKH.add(kh);
        return "redirect:/admin/khach-hang/hien-thi";
    }

    @PostMapping("khach-hang/update")
    public String khachHangUpdate(Model model, @RequestParam("hoVaTen") String hoVaTen,
                                  @RequestParam("id") Long id,
                                  @RequestParam("email") String email,
                                  @RequestParam("sdt") String sdt,
                                  @RequestParam("gioiTinh") Integer gioiTinh
    ) {
        KhachHang kh = seviceKH.detail(id);
        kh.setHoTen(hoVaTen);
        kh.setEmail(email);
        kh.setSdt(sdt);
        kh.setGioiTinh(gioiTinh);

        seviceKH.add(kh);
        return "redirect:/admin/khach-hang/hien-thi";
    }


    @GetMapping("giay-phep/hien-thi")
    public String giayphep(Model model) {
        ArrayList<GiayPhep> listNV = seviceGP.getAll();
        model.addAttribute("list", listNV);
        return "/admin/giayphep/giay-phep";
    }

    @GetMapping("giay-phep/delete")
    public String deleteGP(Model model, @RequestParam("id") Long id) {
        seviceGP.delete(id);
        return "redirect:/admin/giay-phep/hien-thi";
    }

    @GetMapping("giay-phep/viewUpdate")
    public String viewUpdateGP(Model model, @RequestParam("id") Long id) {
        GiayPhep listNV = seviceGP.detail(id);
        model.addAttribute("detail", listNV);
        return "/admin/giayphep/update-giay-phep";
    }

    @PostMapping("giay-phep/add")
    public String giayPhepAdd(Model model, @RequestParam("ngayHetHan") Date ngayHetHan,
                              @RequestParam("soGiayPhep") Integer soGiayPhep

    ) {
        if (soGiayPhep > 0) {
            GiayPhep gp = new GiayPhep();
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoGiayPhep(soGiayPhep);
            gp.setTrangThai(1);
            seviceGP.add(gp);
            return "redirect:/admin/giay-phep/hien-thi";
        } else {
            GiayPhep gp = new GiayPhep();
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoGiayPhep(soGiayPhep);
            gp.setTrangThai(0);
            seviceGP.add(gp);
            return "redirect:/admin/giay-phep/hien-thi";
        }


    }

    @PostMapping("giay-phep/update")
    public String giayPhepUpdate(Model model,
                                 @RequestParam("id") Long id, @RequestParam("ngayHetHan") Date ngayHetHan,
                                 @RequestParam("soGiayPhep") Integer soGiayPhep

    ) {
        if (soGiayPhep > 0) {
            GiayPhep gp = seviceGP.detail(id);
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoGiayPhep(soGiayPhep);
            gp.setTrangThai(1);
            seviceGP.add(gp);
            return "redirect:/admin/giay-phep/hien-thi";
        } else {
            GiayPhep gp = seviceGP.detail(id);
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoGiayPhep(soGiayPhep);
            gp.setTrangThai(0);
            seviceGP.add(gp);
            return "redirect:/admin/giay-phep/hien-thi";
        }


    }

    @GetMapping("voucher/hien-thi")
    public String voucher(Model model) {
        ArrayList<Voucher> listNV = seviceVC.getAll();
        model.addAttribute("list", listNV);
        return "/admin/voucher/voucher";
    }

    @GetMapping("voucher/delete")
    public String deleteVC(Model model, @RequestParam("id") Long id) {
        seviceVC.delete(id);
        return "redirect:/admin/voucher/hien-thi";
    }

    @GetMapping("voucher/viewUpdate")
    public String viewUpdateVC(Model model, @RequestParam("id") Long id) {
        Voucher listNV = seviceVC.detail(id);
        model.addAttribute("detail", listNV);
        return "/admin/voucher/update-voucher";
    }

    @PostMapping("voucher/add")
    public String giayPhepAdd(Model model,
                              @RequestParam("giaTriGiam") BigDecimal giaTriGiam,
                              @RequestParam("ngayHetHan") Date ngayHetHan,
                              @RequestParam("soGiayPhep") Integer soGiayPhep

    ) {
        if (soGiayPhep > 0) {
            Voucher gp = new Voucher();
            gp.setGiaTriGiam(giaTriGiam);
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoLuong(soGiayPhep);
            gp.setTrangThai(1);
            seviceVC.add(gp);
            return "redirect:/admin/voucher/hien-thi";
        } else {
            Voucher gp = new Voucher();
            gp.setGiaTriGiam(giaTriGiam);
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoLuong(soGiayPhep);
            gp.setTrangThai(0);
            seviceVC.add(gp);
            return "redirect:/admin/voucher/hien-thi";
        }


    }

    @PostMapping("voucher/update")
    public String voucherUpdate(Model model,
                                @RequestParam("id") Long id, @RequestParam("giaTriGiam") BigDecimal giaTriGiam,
                                @RequestParam("ngayHetHan") Date ngayHetHan,
                                @RequestParam("soGiayPhep") Integer soGiayPhep

    ) {
        if (soGiayPhep > 0) {
            Voucher gp = seviceVC.detail(id);
            gp.setGiaTriGiam(giaTriGiam);
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoLuong(soGiayPhep);
            gp.setTrangThai(1);
            seviceVC.add(gp);
            return "redirect:/admin/voucher/hien-thi";
        } else {
            Voucher gp = seviceVC.detail(id);
            gp.setGiaTriGiam(giaTriGiam);
            gp.setNgayHetHan(ngayHetHan);
            gp.setSoLuong(soGiayPhep);
            gp.setTrangThai(0);
            seviceVC.add(gp);
            return "redirect:/admin/voucher/hien-thi";
        }


    }


    @GetMapping("ban-quyen/hien-thi")
    public String banquyen(Model model) {
        ArrayList<BanQuyen> listBQ = seviceBQ.getAll();
        ArrayList<Sach> listS = sevice.getAll();
        ArrayList<GiayPhep> listGP = seviceGP.getAll();
        model.addAttribute("list", listBQ);
        model.addAttribute("listS", listS);
        model.addAttribute("listGP", listGP);

        return "/admin/banquyen/ban-quyen";
    }

    @GetMapping("ban-quyen/delete")
    public String banquyenVC(Model model, @RequestParam("id") Long id) {
        seviceBQ.delete(id);
        return "redirect:/admin/ban-quen/hien-thi";
    }

    @GetMapping("ban-quyen/viewUpdate")
    public String banquyenViewUpadateVC(Model model, @RequestParam("id") Long id) {
        BanQuyen listNV = seviceBQ.detail(id);
        ArrayList<Sach> listS = sevice.getAll();
        ArrayList<GiayPhep> listGP = seviceGP.getAll();
        model.addAttribute("listS", listS);
        model.addAttribute("listGP", listGP);
        model.addAttribute("detail", listNV);
        return "/admin/banquyen/update-ban-quyen";
    }

    @PostMapping("ban-quyen/add")
    public String banquyenAdd(Model model,
                              @RequestParam("tenSach") Long tenSach,
                              @RequestParam("maGiayPhep") Long maGiayPhep,
                              @RequestParam("nguoiKy") String nguoiKy,
                              @RequestParam("ngayBatdau") Date ngayBatdau,
                              @RequestParam("ngayHetHan") Date ngayHetHan


                              ) {

        BanQuyen bq = new BanQuyen();
        Sach s = new Sach();
        s.setIdSach(tenSach);
        bq.setSach(s);

        GiayPhep gp = new GiayPhep();
        gp.setIdGiayPhep(maGiayPhep);
        bq.setGiayPhep(gp);


        bq.setNguoiKy(nguoiKy);

        bq.setNgayBatdau(ngayBatdau);

        bq.setNgayHetHan(ngayHetHan);

        seviceBQ.add(bq);
        return "redirect:/admin/ban-quyen/hien-thi";


    }

    @PostMapping("ban-quyen/update")
    public String banquyenUpdate(Model model,
                                 @RequestParam("id") Long id,
                                 @RequestParam("tenSach") Long tenSach,
                                 @RequestParam("maGiayPhep") Long maGiayPhep,
                                 @RequestParam("nguoiKy") String nguoiKy,
                                 @RequestParam("ngayBatdau") Date ngayBatdau,
                                 @RequestParam("ngayHetHan") Date ngayHetHan


    ) {

        BanQuyen bq = seviceBQ.detail(id);
        Sach s = new Sach();
        s.setIdSach(tenSach);
        bq.setSach(s);

        GiayPhep gp = new GiayPhep();
        gp.setIdGiayPhep(maGiayPhep);
        bq.setGiayPhep(gp);


        bq.setNguoiKy(nguoiKy);

        bq.setNgayBatdau(ngayBatdau);

        bq.setNgayHetHan(ngayHetHan);

        seviceBQ.add(bq);
        return "redirect:/admin/ban-quyen/hien-thi";



    }


    }

