package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse 
{
  @Test(priority=-2)
  public void d() 
  {
	  Reporter.log("d is running",true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a is running",true);
	  
  }
@Test(priority=-1)
public void v()
{
	Reporter.log("v is running",true);
}


//0 -2 2 8 -7
//-7 -2 0 2 8
}
