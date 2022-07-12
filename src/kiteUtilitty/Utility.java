package kiteUtilitty;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	
	//excel
	//screenshot
	//closing       //void
	public static String readDataFromExcle(int row,int cell) throws EncryptedDocumentException, IOException   
	{
		File myfile=new File("C:\\java selenium\\poi-bin-5.2.2-20220312\\26MarchB.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	public static void captureScreenshot(WebDriver driver,String TDIC) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\photoSelenium\\MyScreenshot"+TDIC+".png");
		FileHandler.copy(src, dest);
		
		
	}
	
		
	
}










