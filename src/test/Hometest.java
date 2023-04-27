package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.Homepage;

public class Hometest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.vrlbus.in/#/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Homepage obje=new Homepage(driver);
	 obje.setvalues("Bangalore","Mangaluru","05-04-2023");
		
	}
}

