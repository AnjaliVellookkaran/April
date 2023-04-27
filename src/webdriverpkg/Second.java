package webdriverpkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Second {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver(); //browser opens
		driver.get("https://www.bing.com"); //url loading
		String src=driver.getPageSource();
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

