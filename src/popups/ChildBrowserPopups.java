package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/ ");
		
		Thread.sleep(1000);
//		2.	To get address of main page  we need to use syntax		
//		String IdOfMainPage=driver.getWindowHandle(); //return type of getWindowHandle method is String

		String mainPageID = driver.getWindowHandle(); //id of main page
		System.out.println(mainPageID);
		
		System.out.println("_______________________________________________");
		
		//to open the child window
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
//		3.	To get address of main page as well child browser we need to use synatx
//		set<String> IdOfMainPage=driver.getWindowHandles();
//		//return type of getWindowHandles method is set<String>
//		
//		to handle multiple window to get multiple id
		Set<String> allPageIDs = driver.getWindowHandles();
		//to get all ids information
		Iterator<String> it = allPageIDs.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		String mainPageId = it.next();//will return main page ID
		String childPageId = it.next();//will return child page id
		
		//to switch focus to child window
//		1.	To handle Child browser popup we need to switch selenium focus from main page to Child browser popup by using syntax
//			driver.switchTo().window("String windowId")
		
		driver.switchTo().window(childPageId);//changing focus from main page to child page
		
		driver.manage().window().maximize();
		//commant on while loop upward
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Velocity");
		//driver.close();
		//driver.quit();
		driver.switchTo().window(mainPageId);//to go in main page we used syntax
		WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(myElement.getText());
		
		driver.switchTo().window(mainPageId);
		WebElement element = driver.findElement(By.xpath("//p[text()='Click below to download a file']"));
		System.out.println(element.getText());
	}

}
