package actionPlusClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//find element
		WebElement texBox = driver.findElement(By.id("autocomplete"));
		//texBox.sendKeys("Good Morning");//using web element method
		//how to sendkey using actions class
		//crreat of object class
		
		Actions act=new Actions(driver);
		
		//using send key method of actions class perform sentkys
		
		act.sendKeys(texBox, "Good Morning").perform();
		
		//how to handle drop down using Actions class
		
		WebElement droupDown = driver.findElement(By.name("dropdown-class-example"));
		
		//using action class method handle drop down
		//by using keboard use sendkeys
		
		act.click(droupDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
