package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample {
    EdgeDriver driver;
	
	
	
	
	@Test
	public void test()
	{
	WebElement fullname=driver.findElement(By.xpath(""));
	
	Actions act=new Actions(driver);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	
	
	
	
	
	
	
	
	
	
	
	
	
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.perform();

	}
}