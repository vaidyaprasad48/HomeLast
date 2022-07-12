package dynamicWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		//Thread.sleep(10000);//100------->1900
		//1. implicit wait
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.close();
		
		
		
		
	
	
	
	
	}
	
	

}
