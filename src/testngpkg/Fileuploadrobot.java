package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
EdgeDriver driver;
	
	@BeforeTest 
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	
	@Test 
	public void test1() throws Exception
	{

		driver.get("https://www.ilovepdf.com/pdf_to_word");	

		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		fileUpload("\"C:\\Users\\DELL\\Downloads\\GLOBALIZATION TESTING.pdf\"");
	}
	public void fileUpload (String p) throws Exception { //throws AWTException {
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	@AfterTest
	public void browserquit()
	{
		//driver.quit()
		
	}
}



