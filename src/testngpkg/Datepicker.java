package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("https://www.expedia.com/");	
		driver.manage().window().maximize();
	}
	
	@Test 
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		
		
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
			 String month1=month.getText();
			 if(month1.equals("April 2023"))
			 {
				 System.out.println(month1);
				 break;
			 }
			 else
			 {
				 driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
				 
			 }
		}
		List<WebElement> alldate=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
		 for(WebElement dateelement:alldate)
		 {
			 String date=dateelement.getAttribute("data-day");
			// System.out.println(date);
			 if(date.equals("25"))
			 {
				 dateelement.click();
				 System.out.println("date selected");
			 }
		 }
			 
	}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}

