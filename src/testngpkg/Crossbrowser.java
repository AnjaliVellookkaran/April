package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
WebDriver driver;

@Parameters("browser")
@BeforeTest
public void setUp(String b)
{
	if(b.equalsIgnoreCase("edge")) 
	{
		driver=new EdgeDriver();
	}

	else if(b.equalsIgnoreCase("firefox")) 
	{
		driver=new FirefoxDriver();
	}

	else
	{
		driver=new ChromeDriver();
	}
}
@Test 
public void browser()
{
	driver.get("https://www.facebook.com");
}
@AfterTest
public void browserquit()
{
	//driver.quit()
	
}
}
