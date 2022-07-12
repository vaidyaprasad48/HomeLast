package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		
		Thread.sleep(1000);
		
	  List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println(searchResults.size());
		
		//for each loop
		
		for(WebElement r:searchResults)//for getting text only
		{
			System.out.println(r.getText());
		}
		
		for(WebElement result:searchResults)//for clicking on required result
		{
			String actualText = result.getText();
			String expectedText = "honda civic";
			if(actualText.equals(expectedText))
			{
				result.click();
				break;
			}
		}
		driver.findElement(By.linkText("Images")).click();
		
		
	}

}
