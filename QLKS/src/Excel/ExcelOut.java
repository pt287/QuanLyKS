/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excel;
import DTO.Phong.PhongDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author capij
 */
public class ExcelOut {
    public void XuatExcel(ArrayList<PhongDTO> dsex) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        
        // Tạo hàng đầu tiên (tiêu đề)
        Row headerRow = sheet.createRow(0);
        String[] headers = {"RType", "RNum", "RPrice"};
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
        }
        
        // Thêm dữ liệu từ danh sách vào tệp Excel
        int rowNum = 1;
        for (PhongDTO e : dsex) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(e.getMaPhong().substring(0, 3));
            row.createCell(1).setCellValue(e.getSoPhong());
            row.createCell(2).setCellValue(String.valueOf(e.getDonGia()));
        }
        
        // Ghi workbook vào file
        try (FileOutputStream fileOut = new FileOutputStream("output.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Đóng workbook để giải phóng tài nguyên
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

