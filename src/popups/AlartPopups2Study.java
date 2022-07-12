package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPopups2Study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		Thread.sleep(1000);
		
//		driver.findElement(By.id("alertBox")).click();
//		
//		Alert alt = driver.switchTo().alert();
//		
//		System.out.println(alt.getText());
//		
//		alt.accept();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(1000);
//		Alert alt1 = driver.switchTo().alert();
//		System.out.println(alt1.getText());
//		alt1.dismiss();
//		
		driver.findElement(By.id("promptBox")).click();
		
		Alert alt2 = driver.switchTo().alert();
		
		alt2.sendKeys("prasad");
		
	
		

	}

}
