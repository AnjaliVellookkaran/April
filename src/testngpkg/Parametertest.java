package testngpkg;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}

	@Parameters("a")
	
	@Test 
	public void test1( String a)
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(a,Keys.ENTER);
		
	}
	@AfterTest
	public void browserquit()
	{
		//driver.quit();	
	}
}
