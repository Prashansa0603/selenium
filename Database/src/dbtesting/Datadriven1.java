package dbtesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven1 {

	public static void main(String[] args) throws Throwable {
		File src = new File("");
		FileInputStream fileInput = new FileInputStream(src);
		Workbook wb= new XSSFWorkbook(fileInput);
		XSSFSheet sheet1=(XSSFSheet) wb.getSheetAt(0);
		int row_count=sheet1.getLastRowNum();
		System.out.println("Total Rows are"+ row_count);
		for(int i=0; i<row_count; i++) 
		{
			String  row= sheet1.getRow(i).getCell(0).getStringCellValue();
					System.out.println(row);			
			
		}
		wb.close();
	}

}
