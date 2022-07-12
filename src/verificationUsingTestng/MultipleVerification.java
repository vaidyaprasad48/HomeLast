package verificationUsingTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void myMethod() 
  {
	String a="pune1";//pune
	String b="pune";
  
	//not equal
	Assert.assertNotEquals(a, b,"TC is failed value are equal");
	Assert.assertNotNull(b, "TC is failed value is null");
  
  }








}
