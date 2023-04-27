package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); //browser opens
		driver.get("https://www.google.com"); //url loading
		String src=driver.getPageSource(); //returns pagesource
		if(src.contains("Images"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}

}
