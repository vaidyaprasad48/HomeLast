package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount = 3)
  public void myTest() 
  {
	  Reporter.log("hello",true);
  }
  @AfterMethod
  public void test()
  {
	  Reporter.log("hi",true);
  }


}
