package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUsingExcle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		File myfile=new File("C:\\java selenium\\poi-bin-5.2.2-20220312\\26MarchB.xlsx");
		 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		//mySheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LogInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserId.sendKeys(UN);
		Password.sendKeys(PWD);
		LogInButton.click();
		
		//for next page we have to used sincronization
		Thread.sleep(1000);
		
		WebElement PinNumber = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		PinNumber.sendKeys(PIN);
		ContinueButton.click();
		
		Thread.sleep(2000);

		WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
	
		String actualUserId = UserName.getText();
		String expectedUserId="ELR321";
		
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("User Id matching test case is Passed");
		}
		else {
			System.out.println("User Id not matching test case is Failed");
		}
		UserName.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		Thread.sleep(2000);
		driver.close();
	

	}

}
