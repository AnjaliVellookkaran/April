package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertexample {
EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/alert_example.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept(); //clicks yes button of the alert
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("efg");
    }

	@After
	public void teardown()
	{
		//driver.quit();
    }

}
