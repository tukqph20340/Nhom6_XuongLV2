package com.example.demo.controller;

import com.example.demo.model.Sach;
import com.example.demo.model.TheLoai;
import com.example.demo.service.SachSevice;
import com.example.demo.service.TheLoaiSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
@Controller
@RequestMapping("/home/")
public class HomeController {

    @Autowired
    SachSevice sevice;

    @Autowired
    TheLoaiSevice theLoaiSevice;
    @GetMapping("hien-thi")
    public  String hienThi(Model model,@RequestParam(defaultValue = "0", name = "page") Integer number){
        Pageable pageable = PageRequest.of(number, 4);
        Page<Sach> list = sevice.phanTrang(pageable);

        ArrayList<TheLoai> listTl = theLoaiSevice.getAll();
        model.addAttribute("list", list);
        model.addAttribute("listtl", listTl);
        return "/commons/home";
    }
}
