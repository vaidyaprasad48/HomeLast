package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1 
{
  @Test
  public void a() 
  {
	  Reporter.log("A is running",true);
  }
  @Test(groups= {"regression"})
  public void b() 
  {
	  Reporter.log("B is running,regression",true);
  }
  @Test(groups= {"sanity"})
  public void c() 
  {
	  Reporter.log("C is running,sanity",true);
  }
  @Test(groups= {"regression"})
  public void d() 
  {
	  Reporter.log("D is running,regression",true);
  }







}
