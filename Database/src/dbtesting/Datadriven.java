package dbtesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Datadriven {

	public static void main(String[] args) throws Throwable {
		// read from excel sheet
		File src = new File("");
		FileInputStream fileInput=new FileInputStream(src);
		Workbook wb =new XSSFWorkbook(fileInput);
		XSSFSheet sheet=(XSSFSheet) wb.getSheetAt(0);
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		// to write to excel sheet
		sheet.getRow(0).createCell(2).setCellValue("City");
		sheet.getRow(1).createCell(2).setCellValue("pune");
		FileOutputStream fileOut = new FileOutputStream(src);
		wb.write(fileOut);
		System.out.println("Data save Successfully");
		wb.close();
	}

}
