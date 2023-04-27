package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
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
		WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediffmail=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		fullname.sendKeys("arjun");
		Actions act=new Actions(driver);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediffmail,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}


