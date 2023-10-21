package HybridDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcel {
	
     public static void hybridread(WebDriver driver) throws Throwable {
    	 
    	 File src = new File("C:\\Users\\HP LAPTOP\\Desktop\\hybrid.xlsx");
    	 FileInputStream fileip = new FileInputStream(src);
    	 
    	 XSSFWorkbook wb=new XSSFWorkbook(fileip);
    	 XSSFSheet s=(XSSFSheet)wb.getSheet("LoginTest");  	//sheet1
    	 
    	 for(int i=0;i<=s.getLastRowNum();i++) 
    	 {
    		 String un=s.getRow(i).getCell(0).toString();
    		 String pw=s.getRow(i).getCell(1).toString();
    	     	 
    	 XSSFSheet d=(XSSFSheet)wb.getSheet("keywords"); 		//Sheet2
    	
    	 for(int j=0; j<=d.getLastRowNum(); j++)
    	 {
    		 String key2=d.getRow(j).getCell(0).toString();
    		 if(key2.equalsIgnoreCase("openurl"));
    		 {
    			 Function.openurl(driver);   
    		 }
    		 if(key2.equalsIgnoreCase("username"));
    		 {
    			 Function.username(driver, un);
    		 }
    		 if(key2.equalsIgnoreCase("password"));
    		 {
    			 Function.password(driver, pw);
    		 }
    		 if(key2.equalsIgnoreCase("login"));
    		 {
    			Function.login(driver); 
    		 }
    		 if(key2.equalsIgnoreCase("logout"));
    		 {
    			 Function.logout(driver);
    		 }
    		 }
    	 }
    	 
    	 
    	 
     }
}
