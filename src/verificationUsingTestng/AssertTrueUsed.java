package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUsed {
  @Test
  public void myMethod() 
  {
	  boolean a=true;
	  boolean b=false;
//	  Assert.assertTrue(b, "TC is failed value is false");//give a also//value is true then we write false 
//	  Reporter.log("TC is passed value is true",true);
  
	  Assert.assertFalse(a,"TC is failed value is true" );//give b also
	  Reporter.log("Tc is passed value is falsed",true);
  
  
  
  
  }
}
