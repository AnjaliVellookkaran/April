package testngpkg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshotpgm {
	ChromeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");	
	}
	
	@Test 
	public void elementscrnshot() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //takes screenshot of an element and returns file as o/p
			FileHandler.copy(src, new File("E://image.png"));
			WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")); //Locate button
			File src1=button.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src1,new File("./Screenshot/imgg.png"));//stores in working directory of this project
			
	}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}


