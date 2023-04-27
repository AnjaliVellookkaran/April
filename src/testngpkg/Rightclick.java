package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclick {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	}
	
	@Test 
	public void test1()
	{
		WebElement rightclickme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement doubleclicks=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		Actions act=new Actions(driver);
		act.contextClick(rightclickme).perform();
		act.click(edit).perform();
      	Alert a=driver.switchTo().alert();
      	a.accept();
		act.doubleClick(doubleclicks).perform();
//		Alert b=driver.switchTo().alert();
//      b.accept();
}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}

