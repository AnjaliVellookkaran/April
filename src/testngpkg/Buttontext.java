package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttontext {
ChromeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		ChromeOptions options=new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");	
	}
	
	@Test 
	public void test1()
	{
		ChromeOptions options=new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
		WebElement buttontext=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		Actions act=new Actions(driver);
		act.perform();
		String string=buttontext.getAttribute("value"); //because value ="Check availability" in this site
		if(string.equals("Check available"))
		{
			System.out.println("check availability is displayed");

		}
		else
		{
			System.out.println("check availability is not displayed");
		}
}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}

