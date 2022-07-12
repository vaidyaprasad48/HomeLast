package kiteUtilitty;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kitebase.BaseNew;

public class Listener extends BaseNew implements ITestListener
{
	BaseNew b= new BaseNew();
	//WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("congratulation your TC is Passed,passed TC name is"+result.getName(),true);
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("sorry your Tc is failed,failed TC name is "+result.getName(),true);
		
		String name = result.getName();
		try {
			b.captureScreenshot(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
