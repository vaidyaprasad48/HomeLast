package ListnerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListnerTest.Listener.class)
public class MyTest {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("hi i am myMethod1",true);
  }
  @Test
  public void myMethod2() 
  {
	  Assert.fail();
	  Reporter.log("hi i am myMethod2",true);
  }
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("hi i am myMethod3",true);
  }
}
