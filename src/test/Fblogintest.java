package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbcreatepage;
import pages.Fbloginpage;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setUp()
{
	driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test1()
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("bac@gmail.com","ghhbj");
	ob.login();
}
}
