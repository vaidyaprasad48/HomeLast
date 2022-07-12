package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3Study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(1000);
		
		//step1 main page element
		String text = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		System.out.println(text);
		
		//step2 frame1
		driver.switchTo().frame(0);
	//	driver.switchTo().frame("Framename1");
		String text1 = driver.findElement(By.id("frametext")).getText();
		System.out.println(text1);
		
		//step3 switch to main page
		
		driver.switchTo().parentFrame();
		String text2 = driver.findElement(By.linkText("Blogger")).getText();//using linklist locator
		System.out.println(text2);
		
		//step4 switch to frame2
		
		driver.switchTo().frame(1);
		//driver.switchTo().frame("Frame2");
		String text3 = driver.findElement(By.partialLinkText("Cate")).getText();
		System.out.println(text3);
		System.out.println("good morning");
		
		
	
		
		
		
		

	}

}
