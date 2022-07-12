package setSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//position means point class
public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		//to set a position we need to create object of point class and pass x and y coordinate	
		
		System.out.println(driver.manage().window().getPosition());
		Point p= new Point(150, 9);
		//using set position we cn set the driver position
		driver.manage().window().setPosition(p);
		
		
	}

}
