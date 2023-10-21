package Datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Throwable {
		File src= new File("C:\\Users\\HP LAPTOP\\Desktop\\Read.xlsx");
		FileInputStream fileip = new FileInputStream(src);
		
		Workbook wb=new XSSFWorkbook(fileip);
		
		XSSFSheet sheet1=(XSSFSheet)wb.getSheetAt(0);
		
		//to read data from the src file
		
		System.out.println(sheet1.getRow(4).getCell(0).getStringCellValue());
		System.out.println(sheet1.getRow(3).getCell(0).getStringCellValue());
		System.out.println(sheet1.getRow(0).getCell(1).getStringCellValue());
		
		//to write data to src file
		sheet1.getRow(0).createCell(2).setCellValue("Location");
		sheet1.getRow(1).createCell(2).setCellValue("mumbai");
		sheet1.getRow(2).createCell(2).setCellValue("delhi");
		sheet1.getRow(0).createCell(3).setCellValue("Dept");
		sheet1.getRow(1).createCell(3).setCellValue("IT");
		
		FileOutputStream fileout= new FileOutputStream(src);
		wb.write(fileout);
		
		System.out.println("Data saved");
				
		
	}

}
