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

public class Droppable {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod 
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");	
	}
	
	@Test 
	public void test1()
	{
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drophere=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragme,drophere);
		act.perform();
		String string="Dropped!";
		String actual=drophere.getText();
		if(string.equals(actual))
		{
				System.out.println("dropped displayed");
	
			}
			else
			{
				System.out.println("dropped not displayed");
			}

}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}
