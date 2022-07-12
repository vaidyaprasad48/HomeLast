package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableTwo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Thread.sleep(5000);
		
		WebElement second = driver.findElement(By.id("second"));
		Select s= new Select(second);
		System.out.println("multi select status is "+s.isMultiple());
		
		s.selectByVisibleText("Pizza");
		Thread.sleep(3000);
		s.selectByValue("donut");
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.deselectByIndex(3);
		
		
		
		
		
	}

}
