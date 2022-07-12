package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualUsed {
  @Test
  public void myMethod() 
  {
	  String a="pune";
	  String b="pune";
	  
	  //classname.methodname
//	  Assert.assertEquals(a, b,"a and b value are not matching then test case  failed");
//	  Reporter.log("a and b value are  matching then test case  passed",true);
//  
//  
  
	  Assert.assertNotEquals(a, b,"a and b value are matching than tc is failed");
	  Reporter.log("a and b value are not matching then test case  passed",true);
  
  }











}
