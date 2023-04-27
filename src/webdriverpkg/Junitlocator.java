package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Junitlocator {
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
		
		driver.findElement(By.id("email")).sendKeys("abcgsh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcgsb738");
		driver.findElement(By.name("login")).click();
}
	@After
	public void teardown()
	{
		//driver.quit();
		
	
}
}