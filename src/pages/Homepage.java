package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;

	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destinations=By.xpath("//*[@id=\"ToCity\"]");
	By Date=By.xpath("//*[@id=\"txtFromDate\"]");
	By Search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");

	public Homepage(WebDriver driver)
	{
	 this.driver=driver;	

	}

	public void setvalues(String sourc,String destintn,String dmy)
	 {
		 driver.findElement(source).sendKeys(sourc,Keys.ENTER);
		 driver.findElement(destinations).sendKeys(destintn,Keys.ENTER);
		 driver.findElement(Date).clear();
		 driver.findElement(Date).sendKeys(dmy);
		 driver.findElement(Search).click();
	
	} 
	 }





