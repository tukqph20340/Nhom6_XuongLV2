//package com.example.demo.service;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletResponse;
//
//import com.example.demo.model.Sach;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFFont;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//
//public class ExcelProductGenerator {
//
//    private List<Sach> listProducts;
//    private XSSFWorkbook workbook;
//    private XSSFSheet sheet;
//
//    public ExcelProductGenerator(List<Sach> listProducts) {
//        this.listProducts = listProducts;
//        workbook = new XSSFWorkbook();
//    }
//
//    private void writeHeader() {
//        sheet = workbook.createSheet("Sach");
//
//        Row row = sheet.createRow(0);
//
//        CellStyle style = workbook.createCellStyle();
//        XSSFFont font = workbook.createFont();
//        font.setBold(true);
//        font.setFontHeight(16);
//        style.setFont(font);
//
//        createCell(row, 0, "ID Sách", style);
//        createCell(row, 1, "Tên Nhà Cung Cấp", style);
//        createCell(row, 2, "Tên Tác Giả", style);
//        createCell(row, 3, "Tên Thể Loại", style);
//        createCell(row, 4, "Tên Nhà Xuất Bản", style);
//        createCell(row, 5, "Link Ảnh", style);
//        createCell(row, 6, "Tên Sách", style);
//        createCell(row, 7, "Ngày Xuất Bản", style);
//        createCell(row, 8, "Giá Nhập", style);
//        createCell(row, 9, "Giá Bán", style);
//        createCell(row, 10, "Số Lượng", style);
//        createCell(row, 11, "Trạng Thái", style);
//
//    }
//
//    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
//        sheet.autoSizeColumn(columnCount);
//        Cell cell = row.createCell(columnCount);
//        if (value instanceof Integer) {
//            cell.setCellValue((Integer) value);
//        } else if (value instanceof Double) {
//            cell.setCellValue((Double) value);
//        } else if (value instanceof Long) {
//            cell.setCellValue((Long) value);
//        } else if (value instanceof Boolean) {
//            cell.setCellValue((Boolean) value);
//        } else {
//            cell.setCellValue((String) value);
//        }
//        cell.setCellStyle(style);
//    }
//
//    private void write() {
//        int rowCount = 1;
//
//        CellStyle style = workbook.createCellStyle();
//        XSSFFont font = workbook.createFont();
//        font.setFontHeight(14);
//        style.setFont(font);
//
//        for (Sach product : listProducts) {
//            Row row = sheet.createRow(rowCount++);
//            int columnCount = 0;
//
//            createCell(row, columnCount++, product.getIdSach(), style);
//            createCell(row, columnCount++, product.getNhaCungCap().getTen(), style);
//            createCell(row, columnCount++, product.getTacGia().getHoVaTen(), style);
//            createCell(row, columnCount++, product.getTheLoai().getTen(), style);
//            createCell(row, columnCount++, product.getNhaXuatBan().getTen(), style);
//            createCell(row, columnCount++, product.getFileAnh(), style);
//            createCell(row, columnCount++, product.getTieuDe(), style);
//            createCell(row, columnCount++, product.getNgayXuatBan(), style);
//            createCell(row, columnCount++, product.getGiaNhap(), style);
//            createCell(row, columnCount++, product.getGiaBan(), style);
//            createCell(row, columnCount++, product.getSoLuong(), style);
//            createCell(row, columnCount++, product.getTrangThai()==1?"Còn Hàng":"Hết Hàng", style);
//
//        }
//    }
//
//    public void generate(HttpServletResponse response) throws IOException {
//        writeHeader();
//        write();
//        ServletOutputStream outputStream = response.getOutputStream();
//        workbook.write(outputStream);
//        workbook.close();
//
//        outputStream.close();
//
//    }
//}