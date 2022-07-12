package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUses 
{
	@Test
	  public void d() 
	  {
		  Reporter.log("d is running",true);
	  }
	  @Test(enabled=false)
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
