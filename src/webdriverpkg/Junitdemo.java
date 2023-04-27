package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.edge.EdgeDriver;

public class Junitdemo {
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com");
		String src=driver.getPageSource(); 
		if(src.contains("Login"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	
}
}
