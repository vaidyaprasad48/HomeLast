package ListnerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kitebase.BaseNew;


public class Listener extends BaseNew implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("screenshot taken, placed check TC",true);
		Reporter.log("failed TC name is "+result.getName(),true);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC is passed",true);
		Reporter.log("success TC name is "+result.getName(),true);
		
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC is skipped please check dependent method",true);
		Reporter.log("Skipped TC name is "+result.getName(),true);
		
	}

}
