package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium1stCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\java selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://majhinaukri.in/");
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("prasad@123");
		//driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		//driver.findElement(By.xpath("//input[@value='option2']")).click();
		
		
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9302986%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuuCyy8UV3jX4aDDF7TAtjAiwUg_EwIVzQwJlRJDkn2ozF4pYHfj3MkaAgnVEALw_wcB");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("prasad");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("25");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("25");
		
		

		
		

		
		
		
		
		
		

	}

}
