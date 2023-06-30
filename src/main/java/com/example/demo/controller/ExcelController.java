//package com.example.demo.controller;
//
//import com.example.demo.model.Sach;
//import com.example.demo.repository.SachRepository;
//import com.example.demo.service.ExcelProductGenerator;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//@Controller
//
//public class ExcelController {
//    @Autowired
//    SachRepository sevice;
//
//    @GetMapping("/admin/san-pham/excel")
//    public void exportProductIntoExcel(HttpServletResponse response) throws IOException {
//        response.setContentType("application/octet-stream");
//        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
//        String currentDateTime = dateFormatter.format(new Date());
//
//        String headerKey = "Content-Disposition";
//        String headerValue = "attachment; filename=products_" + currentDateTime + ".xlsx";
//        response.setHeader(headerKey, headerValue);
//
//        List<Sach> listOfProducts = sevice.findAll();
//
//        ExcelProductGenerator generator = new ExcelProductGenerator(listOfProducts);
//
//        generator.generate(response);
//    }
//
//
//
//
//}
