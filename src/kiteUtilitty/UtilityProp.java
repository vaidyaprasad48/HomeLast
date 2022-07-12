package kiteUtilitty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp 
{
	
	public static String getDataFromPropertiesFiles(String key) throws IOException 
	{
		
		Properties prop=new Properties();//create a object of properties files
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\26thMarchB Selenium\\myProperties.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
		
	}

}
