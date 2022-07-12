package webTableTableReading;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablrEg2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.news18.com/cricketnext/ipl-2022/points-table.html");
		
		Thread.sleep(1000);
		
		List<WebElement> row = driver.findElements(By.xpath("(//table//tr)"));
		System.out.println(row.size());
		//for each loop
		for(WebElement Q:row)
		{
			System.out.println(Q.getText()+" ");
		}
		
		//for coloum
		List<WebElement> coloums = driver.findElements(By.xpath("(//table//tr[1]//th"));
		System.out.println(coloums.size());
		
		
	}

}
