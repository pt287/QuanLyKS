/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.Integer;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
/**
 *
 * @author TuiLaZit
 */
public class ExcelIn {
    public ArrayList<ModelExcelIn> NhapPhong(String a) {
        ArrayList<ModelExcelIn> list = new ArrayList<ModelExcelIn>();
        try {
            FileInputStream excelFile = new FileInputStream(new File(a));
            Workbook wb = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = wb.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            Iterator<Row> iterator = datatypeSheet.iterator();
            FormulaEvaluator formu=wb.getCreationHelper().createFormulaEvaluator();
            
            if (iterator.hasNext()) {
                iterator.next(); // Bỏ qua dòng tiêu đề
            }
            
            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                ModelExcelIn RModel = new ModelExcelIn();

                Cell cellRType = currentRow.getCell(0);
                Cell cellRNum = currentRow.getCell(1);
                Cell cellRPrice = currentRow.getCell(2);

                if (cellRType != null) {
                    RModel.setRType(fmt.formatCellValue(cellRType));
                    System.out.println();
                }
                if (cellRNum != null) {
                    RModel.setRNum(fmt.formatCellValue(cellRNum));
                }
                if (cellRPrice != null) {
                    try {
                        double str = (double) getCellValue(cellRPrice,formu);
                        RModel.setRPrice((int)str);
                    } catch (NumberFormatException e) {
                        // Xử lý ngoại lệ cho định dạng số
                        RModel.setRPrice(0); // hoặc bất kỳ giá trị mặc định nào
                    }
                }

                list.add(RModel);
            }
            wb.close();
            excelFile.close();
        } catch (FileNotFoundException e) {
            // Xử lý ngoại lệ khi không tìm thấy tệp
            e.printStackTrace();
        } catch (IOException e) {
            // Xử lý ngoại lệ IO
            e.printStackTrace();
        }

        return list;
    }
    private static Object getCellValue(Cell cell, FormulaEvaluator evaluator) {  
        CellValue cellValue = evaluator.evaluate(cell);  
        switch (cellValue.getCellTypeEnum()) {  
          case BOOLEAN:  
            return cellValue.getBooleanValue();  
          case NUMERIC:  
            return cellValue.getNumberValue();  
          case STRING:  
            return cellValue.getStringValue();  
          case BLANK:  
            return "";  
          case ERROR:  
            return cellValue.getError(cell.getErrorCellValue()).getStringValue();  
          // CELL_TYPE_FORMULA will never happen  
          case FORMULA:  
            default:  
              return null;  
        }  
      }
}