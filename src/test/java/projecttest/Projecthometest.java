package projecttest;

import org.testng.annotations.Test;
import org.testng.Assert;
import project.Projecthome;
import project.Projectlogin;

public class Projecthometest extends Base {
	Projecthome homepage;
  @Test
  public void hometest() {
  
	  Projectlogin signinpr=new Projectlogin(driver);
	  signinpr.enterusernameandpassword("admin","admin");
	  
	  homepage=signinpr.signinbutton();
	  homepage.isUserAccountClick().isLogOutAccount();
	  System.out.println("Successfully Logged out!");
	  
	  String expected="Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(expected,actual,"log out failed!");
	  
	  
  }
}
