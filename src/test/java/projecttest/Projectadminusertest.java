package projecttest;

import java.io.IOException;
import utilities.Fakerutilites;

import org.testng.Assert;
import org.testng.annotations.Test;


import project.Projectadminuser;
import project.Projecthome;
import project.Projectlogin;
import utilities.Excelutilities;

public class Projectadminusertest extends Base {
	
	Fakerutilites fakerutility=new Fakerutilites();
	Projecthome homepage;
	Projectadminuser adminpr;
	
	
  @Test
  public void isnewuserisabletocreate() throws IOException {
	  
	  String adminusername=Excelutilities.getStringdata(1,0,"adminpagetest");
	  String adminuserpassword=Excelutilities.getStringdata(1,1,"adminpagetest");
	  /*String newusername=Excelutilities.getStringdata(2,0,"adminpagetest");
	  String newuserpassword=Excelutilities.getStringdata(2,1,"adminpagetest");*/
	  String newusername=fakerutility.getFakeFirstName();
	  String newuserpassword=fakerutility.getPassword();
	  
	 
	  
	  Projectlogin signinpr=new  Projectlogin(driver);
	  
	  signinpr.enterusernameandpassword(adminusername,adminuserpassword);
	  
	  homepage=signinpr.signinbutton();
	  
	  adminpr=homepage.isuserabletocllickadminusers();
	  adminpr.isuserabletoclicknewbutton();
	  adminpr.isuserabletoenterusername(newusername);
	  adminpr.isuserabletoenteruserpassword(newuserpassword);
	  adminpr.isuserabletoselectusertype();
	  adminpr.isuserabletoclicksavebutton();
	  
	  
	 boolean isaccountcreated=adminpr.isuserabletocreatenewaccountsuccesfully();
	  Assert.assertTrue(isaccountcreated,"Account not created successfully");
  }
}
