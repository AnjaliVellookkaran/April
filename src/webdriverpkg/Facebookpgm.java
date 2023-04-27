package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebookpgm {
EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ab");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ab5267376");
		driver.findElement(By.xpath("//button[@name='login']")).click();
}
	@After
	public void teardown()
	{
		//driver.quit();
	}
}
	