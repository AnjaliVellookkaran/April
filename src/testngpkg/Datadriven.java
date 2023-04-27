package testngpkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("http://www.facebook.com");	
	}
	
	@Test 
	public void test1() throws Exception
	{ 
		FileInputStream fo=new FileInputStream("C:\\USERS\\ADMIN\\DESKTOP\\LUMINAR\\book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fo); //return workbook details
		XSSFSheet sh=wb.getSheet("Sheet1"); //return sheet details
		int rowcount=sh.getLastRowNum();// return row count
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue(); //firstrow firstvalue
			String pwsd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username+" password="+pwsd);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(pwsd);
			driver.findElement(By.name("login")).click();
			driver.navigate().back();
		}
		
		
		
	}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}


