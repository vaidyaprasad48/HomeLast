package webTableTableReading;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		//how to find no. of row in table
		
		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		
		int totalNumOfRows = row.size();
		System.out.println("total no. of rows in table " + totalNumOfRows);
		
		//how to find total no. of coloums in table
		
		List<WebElement> coloums = driver.findElements(By.xpath("//table//tr[1]//th"));
		
		int totalNumOfColoums = coloums.size();
		System.out.println("total number of coloums in table " + totalNumOfColoums);
		
		//how to read header
		//by for each loop
		for(WebElement header:coloums)
		{
			System.out.print(header.getText()+" ");
		}
		
		//how to read all rows from table
		List<WebElement> AllrowsData = driver.findElements(By.xpath("//table//tr"));//first i have taken [2]
		
		//by using iterator
		Iterator<WebElement> it = AllrowsData.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" ");
			System.out.println();
		}
		
	}

}
