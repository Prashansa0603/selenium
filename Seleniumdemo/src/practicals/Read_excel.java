package practicals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excel {

	public static void main(String[] args) throws Throwable  {
		File src=new File("");
		
		FileInputStream fileInput=new FileInputStream(src);
		
		Workbook wb=new XSSFWorkbook(fileInput);
		
		XSSFSheet Sheet1=(XSSFSheet) wb.getSheetAt(0);
		
		System.out.println(Sheet1.getRow(2).getCell(0).getStringCellValue());
		
		//to write to the excel sheet
		
		Sheet1.getRow(0).createCell(2).setCellValue("City");
		
		Sheet1.getRow(1).createCell(2).setCellValue("Pune");
		
		FileOutputStream fileOut = new FileOutputStream(src);
		
		wb.write(fileOut);
		
		System.out.println("Data Save Successfully");
		
		wb.close();
	}

}
