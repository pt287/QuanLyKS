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
/**
 *
 * @author TuiLaZit
 */
public class ExcelIn {
    public ArrayList NhapPhong(){
        ArrayList<ModelExcelIn> list = new ArrayList<ModelExcelIn>();
        try{
            FileInputStream excelFile = new FileInputStream(new File("excelRoom.xlsx"));
            Workbook wb = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = wb.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            Iterator<Row> iterator = datatypeSheet.iterator();
            Row firstRow = iterator.next();
            Cell firstCell = firstRow.getCell(0);
            while(iterator.hasNext()){
                Row currentRow= iterator.next();
                ModelExcelIn RModel = new ModelExcelIn();
                RModel.setRType(currentRow.getCell(0).getStringCellValue());
                RModel.setRNum(currentRow.getCell(1).getStringCellValue());
                RModel.setRPrice(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(3))));
                list.add(RModel);
            }
            wb.close();
        } catch(FileNotFoundException e){
            //báo lỗi
        }
        catch(IOException e){
            //báo lỗi
        }
        return list;
    }
}
