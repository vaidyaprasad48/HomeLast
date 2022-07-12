package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@Class='_2KpZ6l _2doB4z']")).click();
		//org.openqa.selenium.ElementClickInterceptedException
		//driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("redmi 11 pro");
		
		driver.findElement(By.name("q")).sendKeys("redmi notr 9 pro max");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
