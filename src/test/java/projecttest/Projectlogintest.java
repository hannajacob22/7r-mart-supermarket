package projecttest;



    
	
import org.testng.annotations.Test;



import project.Projectlogin;
import utilities.Excelutilities;

import java.io.IOException;

import org.testng.Assert;
		
	      
		   public class Projectlogintest extends Baseclassnew{
		 
		
			
	    	  @Test
			    public void VerifyIsUserAbletoEnterValidCredentials() {
		  
				
				 Projectlogin signinpr=new Projectlogin(driver);
				 
				 signinpr.enterusernameandpassword("admin","admin");
				 
				
				 signinpr.signinbutton();
				 
				 boolean ishomebuttondisplayed=signinpr.ishomebuttondisplayed();
				 Assert.assertTrue(ishomebuttondisplayed, "homebutton is not found");
			}
			
			
			@Test
		    public void VerifyIsUserAbletoEnterValidUserNameandInvalidPassword() throws IOException {
				
				
				String username=Excelutilities.getStringdata(1, 0,"loginpagetest");
				String password=Excelutilities.getStringdata(1, 1,"loginpagetest");
				
				Projectlogin signinpr=new Projectlogin(driver);
				 signinpr.enterusernameandpassword(username,password);
				 signinpr.signinbutton();
				 
				 boolean ishomebuttondisplayed=signinpr.ishomebuttondisplayed();
				 Assert.assertTrue(ishomebuttondisplayed, "homebutton is not found");
			}
			
			
			
			@Test
			
			
		    public void VerifyIsUserAbletoEnterInvalidUserNameandValidPassword() {
				Projectlogin signinpr=new Projectlogin(driver);
				 
				 signinpr.enterusernameandpassword("m","admin");
				 
				 signinpr.signinbutton();
				 
				 boolean ishomebuttondisplayed=signinpr.ishomebuttondisplayed();
				 Assert.assertTrue(ishomebuttondisplayed, "homebutton is not found");
			}
			
			
			@Test
		    public void VerifyIsUserAbletoEnterInalidUserNameandInvalidPassword() {
				Projectlogin signinpr=new Projectlogin(driver);
				 
				signinpr.enterusernameandpassword("ad","ad");
				signinpr.signinbutton();
				 
				boolean ishomebuttondisplayed=signinpr.ishomebuttondisplayed();
				 Assert.assertTrue(ishomebuttondisplayed, "homebutton is not found");
			}
			

}
