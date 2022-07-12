package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse 
{
	@Test
	  public void d() 
	  {
		//Assert.fail();
		  Reporter.log("d is running",true);
	  }
	  @Test(dependsOnMethods = {"d"}, invocationCount =2)
	  public void a()
	  {
		  Reporter.log("a is running",true);
		  
	  }
	@Test
	public void v()
	{
		Reporter.log("v is running",true);
	}

}
