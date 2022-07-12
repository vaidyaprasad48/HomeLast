package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		
		WebElement show = driver.findElement(By.id("show-textbox"));
		
		WebElement displayed = driver.findElement(By.id("displayed-text"));
		
		if(displayed.isDisplayed())
		{
			System.out.println("text box is displayed");
		}
		else
		{
			show.click();
			System.out.println("tex box is now displayed");
			
		}
		hide.click();
		if(displayed.isDisplayed())
		{
			System.out.println("text box is displayed");
		}
		else
		{
			System.out.println("text box is not displayed");
		}
		
		
		
		
		
	}

}
