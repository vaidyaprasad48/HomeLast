package setSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//size means dimension class
public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getSize());
		
		//to set the size to create object of dimension class and pass width and hight
		
		Dimension d= new Dimension(1111, 100);
		//using set size method
		driver.manage().window().setSize(d);
		

	}

}
