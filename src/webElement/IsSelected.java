package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		//checkbox1.click();
		if(checkbox1.isSelected())
		{
			System.out.println("check box is already selected");
			
		}
		else
		{
			
			
			checkbox1.click();
			System.out.println("check box is now selected");
			
		}
		
		
		

	}

}
