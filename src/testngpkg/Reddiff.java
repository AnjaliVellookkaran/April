package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiff {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");	
	}
	
	@Test 
	public void test1()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if (logo)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	
	@Test
	public void test2()
	{
		boolean radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radio)
		{
			System.out.println("radio buttons are selected");
		}
		else
		{
			System.out.println("radio buttons are not selected");
		}
	}
	
	@Test
	public void test3()
	{
		boolean button=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		
		if(button)
			{
			System.out.println("create my account button is enabled");
			}
		else
		{
			System.out.println("create my account button is not enabled");
		}
	}
	
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}
