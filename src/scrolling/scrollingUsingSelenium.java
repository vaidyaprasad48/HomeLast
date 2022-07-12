package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingUsingSelenium {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		
		//1. implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//driver.close();
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(90,800)");
	}

}
