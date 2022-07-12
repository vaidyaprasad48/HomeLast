package ListnerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListnerTest.Listener.class)
public class MyTest2 {
  @Test
  public void myMethod4() 
  {
	  Reporter.log("hi i am myMethod4",true);
  }
  @Test
  public void myMethod5() 
  {
	  Assert.fail();
	  Reporter.log("hi i am myMethod5",true);
  }
  @Test(dependsOnMethods = {"myMethod5"})
  public void myMethod6() 
  {
	  Reporter.log("hi i am myMethod6",true);
  }
}
