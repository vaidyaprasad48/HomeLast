package actionPlusClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		//find soyrce and destination
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement destination = driver.findElement(By.id("amt8"));

		//how to use drag and drop using actions class
		
		//creat object of action class and pass driver object
		
		Actions act=new Actions(driver);
		//by using action class method perform desired action
		
		//act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();//muliple source aasel tr build().perform()
		act.dragAndDrop(source, destination).perform();
	
	}

}
