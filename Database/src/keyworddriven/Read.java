package keyworddriven;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Read {

	public static void hybridread(WebDriver w) throws Throwable {
		FileInputStream I = new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook(I);
		XSSFSheet s=wb.getSheet("LoginTest");
		
		for(int i=0; i<=s.getLastRowNum();i++)
		{
			try
			{
				String un=s.getRow(i).getCell(0).toString();
				String pw=s.getRow(1).getCell(1).toString();

				XSSFSheet sh=wb.getSheet("Keywords");
				
				for(int j=0; j<=sh.getLastRowNum() ; j++)
				{
					String key=sh.getRow(j).getCell(0).toString();
					
					if(key.equalsIgnoreCase("openurl"));
					{
					   Functions.openUrl(w);	//calling
					}
					if(key.equalsIgnoreCase("username"))
					{
						Functions.username(w, un);  // demo
					}
					
					if(key.equalsIgnoreCase("password"))
					{
						Functions.password(w, pw);
					}
					if(key.equalsIgnoreCase("login"))
					{
					    Functions.login(w);
					}
					if(key.equalsIgnoreCase("logout"))
					{	
						Functions.logout(w);
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
					
				
			
		}
		
		}	
}

