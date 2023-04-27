package testngpkg;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnggrouping {
EdgeDriver driver;
	
//	@BeforeTest //1
//	public void setup()
//	{
//		driver=new EdgeDriver();
//	}
//	@BeforeMethod //2 //5
//	public void urlloading()
//	{
//		driver.get("http://www.google.com");
//		
//	}
	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
		
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("test2");
		
	}
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("test3");
		
	}
	@Test(groups= {"regression"})
	public void test4()
	{
		System.out.println("test4");
		
	}
	@Test(groups= {"sanity"})
	public void test5()
	{
		System.out.println("test5");
		
	}
	@AfterMethod 
	public void aftrmthd()
	{
		System.out.println("aftermethod");
	}
	
	@AfterTest 
	public void browserquit()
	{
		//driver.quit()
		
	}
	
}
