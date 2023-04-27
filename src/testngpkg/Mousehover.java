package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("https://www.ebay.com");	
	}
	
	@Test 
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mousehover=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions act=new Actions(driver); //to handle keyboard or mouse events
		act.moveToElement(mousehover).perform(); //hover the mouse
		WebElement select=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		select.click();
		act.perform();
}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}
