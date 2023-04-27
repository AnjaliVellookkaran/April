package testngpkg;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
// @beforesuite
// @beforemethod
// @beforetest
// @test
// @aftertest
// @aftermethod
	EdgeDriver driver;
	
	@BeforeTest //1
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod //2 //5
	public void urlloading()
	{
		driver.get("http://www.google.com");
		
	}
	@Test(priority=2,invocationCount=2,dependsOnMethods="test2") //depends on test2 to run //runs with 2nd priority and runs 2times//3
	public void test1()
	{
		System.out.println("test1");
		
	}
	@Test(priority=1,enabled=false)//6
	public void test2()
	{
		System.out.println("test2");
		
	}
	@AfterMethod //4 //7
	public void aftrmthd()
	{
		System.out.println("aftermethod");
	}
	
	@AfterTest //8
	public void browserquit()
	{
		//driver.quit()
		
	}
	
}











