package Hybrid;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcel {
	public static void hybridread(WebDriver dr) throws Throwable {

	File src=new File("C:\\Users\\HP LAPTOP\\Desktop\\hybrid.xlsx");
	FileInputStream fileip=new FileInputStream(src);

	XSSFWorkbook wb=new XSSFWorkbook(fileip);

	XSSFSheet s=(XSSFSheet)wb.getSheet("LoginTest");//sheet1

	for(int i=0;i<=s.getLastRowNum();i++)
	{
		String un=s.getRow(i).getCell(0).toString();
		String pw=s.getRow(i).getCell(1).toString();

		XSSFSheet data=(XSSFSheet)wb.getSheet("Keywords"); //sheet2

		for(int j=0;j<=data.getLastRowNum();j++)
		{
			String key2=data.getRow(j).getCell(0).toString();
			if(key2.equalsIgnoreCase("openurl"))
			{
				Function.openurl(dr);
			}
			if(key2.equalsIgnoreCase("username"))
			{
				Function.username(dr, un);

			}

			if(key2.equalsIgnoreCase("password"))
			{
				Function.password(dr, pw);
			}

			if(key2.equalsIgnoreCase("login"))
			{
				Function.login(dr);
			}

			if(key2.equalsIgnoreCase("logout"))
			{
				Function.logout(dr);
			}
		}
	}
}
}

