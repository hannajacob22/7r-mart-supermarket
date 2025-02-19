package projecttest;

import org.testng.annotations.Test;
import org.testng.Assert;
import project.Projecthome;
import project.Projectlogin;
import project.Projectmanagenews;


public class Projectanagenewstest extends Base {
	Projecthome homepage;
	Projectmanagenews managepr;
	
  @Test
  public void managenewstest() {
	  
	  Projectlogin signinpr=new  Projectlogin(driver);
	  signinpr.enterusernameandpassword("admin", "admin");
	  homepage=signinpr.signinbutton();
	  homepage.isuserabletocllickmanagenewsbutton();
	  
	  Projectmanagenews managepr=homepage.isuserabletocllickmanagenewsbutton();
	  managepr.isuserabletoclicknewbutton();
	  managepr.isuserabletoenternews("Sports");
	  managepr.isuserabletoclicksavebutton();
	  
	  boolean isnewscreated=managepr.isuserabletocreatenewnewsuccesfully();
	  Assert.assertTrue(isnewscreated,"News not created successfully");
	  
	  
  }
}
