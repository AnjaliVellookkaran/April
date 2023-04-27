package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buscharter {
	WebDriver driver;
	By buscharter=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By name=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By email=By.xpath("//*[@id=\"txtEmail\"]");
	By mobileno=By.xpath("//*[@id=\"txtMobileNo\"]");
	By catg=By.xpath("//*[@id=\"TourCategory\"]");
	By from=By.xpath("//*[@id=\"txtFromCity\"]");
	By to=By.xpath("//*[@id=\"txtToCity\"]");
//	By date=By.xpath("//*[@id=\"txtFromDate\"]");
	By pickup=By.xpath("//*[@id=\"txtPickup\"]");
	By passengerno=By.xpath("//*[@id=\"txtnoOfPassenger\"]");
	By time=By.xpath("//*[@id=\"txtPickupHour\"]");
	By timemin=By.xpath("//*[@id=\"txtPickMinute\"]");
	By range=By.xpath("//*[@id=\"txtPickTimeRange\"]");
	public Buscharter(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void buscharterclick()
	{
		driver.findElement(buscharter).click();

		driver.findElement(name).sendKeys("Anjali");
		driver.findElement(email).sendKeys("abcdefg@gmail.com");
		driver.findElement(mobileno).sendKeys("6867867998",Keys.ENTER);
		driver.findElement(catg).clear();
		driver.findElement(catg).sendKeys("Group tour",Keys.ENTER);
		driver.findElement(from).sendKeys("bangalore");
		driver.findElement(to).sendKeys("mangalore");
		driver.findElement(pickup).sendKeys("mangalore");
		driver.findElement(passengerno).sendKeys("2");
		driver.findElement(time).sendKeys("10",Keys.ENTER);
		driver.findElement(timemin).sendKeys("40",Keys.ENTER);
		// driver.findElement(range).clear();
		driver.findElement(range).sendKeys("am",Keys.ENTER);
		
		
//		driver.findElement(date);
//		while(true)
//		{
//			WebElement month=driver.findElement(By.xpath("/html/body/div[2]"));
//			 String month1=month.getText();
//			 if(month1.equals("April 2023"))
//			 {
//		
//				 break;
//			 }
//			 else
//			 {
//				 driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
//				 
//			 }
//		}
//		List<WebElement> alldate=driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td"));
//		 for(WebElement dateelement:alldate)
//		 {
//			 String date=dateelement.getAttribute("day");
//			// System.out.println(date);
//			 if(date.equals("7"))
//			 {
//				 dateelement.click();
//				 
//			 }
//		 }
//	}
//		
//		
//		
}	
}
	

