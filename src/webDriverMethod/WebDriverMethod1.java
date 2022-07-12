package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//get--------->to enter url in browser
		
		driver.get("https://majhinaukri.in/");
		
		//close
		
		//driver.close();
		
		//quit
		//driver.quit();
		
		//maximize/ minimize
		
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//navigat------------------->
		//driver.navigate().to("https://www.google.com/");
		
	//	driver.navigate().back();
		
	//	driver.navigate().forward();
		
	//	driver.navigate().refresh();
		
		//getTitle
	
	
	System.out.println(driver.getTitle());
	String title = driver.getTitle();
	
	System.out.println(title);
		
		//getcurrenturl------------------------->
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	System.out.println(driver.getCurrentUrl());

	}

}
