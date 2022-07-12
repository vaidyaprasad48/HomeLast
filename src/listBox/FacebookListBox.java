package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookListBox {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9302986%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnGtlI4FIUzmBcujN_wjzDoy9X4L1ES_SyUtHw4L-JpPsMOCENRyttcaArmPEALw_wcB");
		
		Thread.sleep(1000);
		
		//1.	Identify list box to be handled and store it in reference variable
		WebElement date = driver.findElement(By.id("day"));
		
		//2.	Create an object of Select class which will accept WebElement as argument
		//Select s= new Select(States);
		Select s=new Select(date);
		//3.	By using one of the select class methods we can select values form list box like 
	
		s.selectByIndex(8);//index starts with zero output become 9
		
		//months
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("6");
		
		//year
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1994");
		
		System.out.println("is multiple is selected "+ s.isMultiple());
		
		


	}

}
