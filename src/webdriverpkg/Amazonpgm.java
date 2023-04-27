package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonpgm {
EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.amazon.in");

		WebElement search=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		search.sendKeys("mobiles");
		search.submit();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		driver.findElement(By.xpath("//*[@class='nav-line-1-container']/span")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anjughdfjh@gmail.com");
		driver.findElement(By.xpath("//*[@class='a-section']/span")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a[4]")).click();
		driver.findElement(By.xpath("//*[@class='nav-left']/a")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
	@After
	public void teardown()
	{
		//driver.quit();
		
	
}
}