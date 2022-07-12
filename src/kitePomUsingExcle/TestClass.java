package kitePomUsingExcle;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{	
		File myfile=new File("C:\\Users\\HP\\Downloads\\poi-bin-5.2.2-20220312//26MarchB.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		
		
		
		
		//stage 1 start browser
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		//stage2 for loginpage
		
		KiteLogInPage login =new KiteLogInPage(driver);
		login.SendUserName(UN);
		login.sendPassword(PWD);
		login.clickOnButton();
		
		Thread.sleep(1000);
		
		KitePinPage pin =new KitePinPage(driver);
		pin.sendPin(PIN);
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home=new KiteHomePage(driver);
		home.validUserName(UN);
		home.logOut();
		
		driver.close();

	}

}
