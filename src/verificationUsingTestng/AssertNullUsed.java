package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUsed {
  @Test
  public void myMethod() 
  {
	  String a=null;
	  String b="xyz";
	  
//	  Assert.assertNull(b,"value is not null TC is failed");//also put a
//	  Reporter.log("value is null tc is passed",true);
//	  
  
  //assert not null
	  Assert.assertNotNull(b, "value is  null tc is failed");//also put a
	  Reporter.log("value is not null tc is passed",true);
	  Assert.fail();
  
  
  
  
  }










}
