package webdriverpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkcount {
EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com");
		List <WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println(l.size());
		for(WebElement w:l)
		{
			String link=w.getAttribute("href");
			String linkText=w.getText();
			System.out.println(link+"----"+linkText); //print all links
		}
}
	@After
	public void teardown()
	{
		//driver.quit();
		
	
}
}