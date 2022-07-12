package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		WebElement text = driver.findElement(By.xpath("//button[text()='Continue']"));
		System.out.println(text.isEnabled());
		
		//driver.findElement(By.xpath("//input[@class='cb-email-input']")).sendKeys("vaidya@gmail.com");
		
		driver.findElement(By.id("cb-user-mail")).sendKeys("vaidya@gmail.com");
		System.out.println(text.isEnabled());
		
		text.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
