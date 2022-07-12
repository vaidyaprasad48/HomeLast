package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPractice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		//1. implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		WebElement practice = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		
		e.executeScript("arguments[0].scrollIntoView(true)",practice);
		
		driver.findElement(By.id("autocomplete")).sendKeys("majhi naukri");
		
		driver.findElement(By.name("radio")).click();
		
		

	}

}
