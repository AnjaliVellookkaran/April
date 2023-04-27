package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploading {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/upload/");	
	}
	
	@Test 
	public void test1()
	{
		
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\DELL\\Downloads\\GLOBALIZATION TESTING (1).pdf");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	
		
}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}

