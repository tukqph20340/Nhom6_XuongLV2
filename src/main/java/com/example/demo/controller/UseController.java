package com.example.demo.controller;


import com.example.demo.beans.SachModel;
import com.example.demo.model.Sach;

import com.example.demo.model.TheLoai;
import com.example.demo.service.SachSevice;
import com.example.demo.service.TaiKhoanSevice;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.security.Principal;
import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping("/home/")
public class UseController {

    @Autowired
    SachSevice sevice;

    @Autowired
    TaiKhoanSevice taiKhoanSevice;

    @Autowired
    private HttpSession httpSession;



    ArrayList<SachModel> list = new ArrayList<>();


    @GetMapping("detail")
    public String hienThi(Model model, @RequestParam("id") Long id) {
        Sach list = sevice.detail(id);
        model.addAttribute("detail", list);
        return "/use/detail";
    }

    @GetMapping("/gio-hang/hien-thi")
    public String addToCart(Model model) {
        Double tongTien = 0.0 ;
        for (SachModel itemTmp : list) {
            tongTien += itemTmp.getSoLuong()*itemTmp.getGiaBan();
        }
        model.addAttribute("totalPrice", tongTien);
        model.addAttribute("countCart", list.size());
        model.addAttribute("list", list);
        return "/use/cart";
    }

    @PostMapping("/gio-hang/add")
    public String index(Model model, @RequestParam("idSach") Long idSach,
                        @RequestParam("tieuDe") String tieuDe
            , @RequestParam("anh") String anh
            , @RequestParam("gia") Double gia
            , @RequestParam("soLuong") Integer soLuong) {

        SachModel sachModel = (SachModel) httpSession.getAttribute("list");
        if(sachModel ==null){

            SachModel sachModel1 = new SachModel(idSach,tieuDe,anh,gia,soLuong);
            list.add(sachModel1);
            httpSession.setAttribute("list", sachModel1);
            return "redirect:/home/gio-hang/hien-thi";
        } else {


            for (SachModel itemTmp : list) {
                if (itemTmp.getIdSach().equals(idSach)) {
                    itemTmp.setSoLuong(itemTmp.getSoLuong() + soLuong);
                    return "redirect:/home/gio-hang/hien-thi";
                }
            }
            list.add(sachModel);
        }
//
//
//        list.add(sachModel);
      return "redirect:/home/gio-hang/hien-thi";

    }
}
