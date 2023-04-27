package webdriverpkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Firstscript {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver(); //browser opens
		driver.get("https://www.google.com"); //url loading
		String actualtitle=driver.getTitle(); //returns actual title of the application
		System.out.println(actualtitle);
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
