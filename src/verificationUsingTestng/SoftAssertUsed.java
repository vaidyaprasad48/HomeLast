package verificationUsingTestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUsed {
  @Test
  public void myMethod() 
  {
	String a="abc";
	String b="abc";
	//to used soft assert we need to create object of softAssert class
	
	SoftAssert soft = new SoftAssert();//object of soft assert
	soft.assertNotEquals(a,b,"Both are equal Tc is failed");
	soft.assertNotNull(b,"value is not null TC is failed");
	soft.assertAll();//when collating assertion fallures used the soft assert class object
	
	  
  }

  @Test
  public void testing()
  {
	  boolean a=true;
	  boolean b=false; 
	  SoftAssert s = new SoftAssert();
	  s.assertTrue(b,"value is false Tc is failed");
	  s.assertFalse(a,"value is true Tc is failed");
	  
	  s.assertAll();
	  
	  
  }




}
