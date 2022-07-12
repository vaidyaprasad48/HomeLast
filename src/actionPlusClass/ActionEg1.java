package actionPlusClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		//seleniumButton.click();//using web element method
		
		
		//how to click using Actions class
		
		 //1 creat object of actions class and pass web driver object
		
		Actions act=new Actions(driver);
		
		//using one the required action complete the process
		
//		act.moveToElement(seleniumButton).perform();
//		act.click().perform();
//		
		//act.moveToElement(seleniumButton).click().build().perform();
		
		         //act.click(seleniumButton).perform();
		
		// right click(context click)using Actions class
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//act.moveToElement(rightClickButton).contextClick().perform();
		       //act.contextClick(rightClickButton).perform();
		
		
		//how to double click using actions
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//object chi garag aaste
		
		//act.moveToElement(doubleClickButton).doubleClick().perform();
		
		act.doubleClick(doubleClickButton).perform();
		
	}

}
