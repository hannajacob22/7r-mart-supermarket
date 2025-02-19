package projecttest;

    
	
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import project.Projectlogin;

import org.testng.Assert;
	

	   public class Projectlogintestdtaprovider extends Base{
	 
	
		
		@Test(dataProvider="credentials")//to get the output click the below 'run'....
		    public void VerifyIsUserAbletoEnterValidCredentials(String userame,String password) {
	  
			
			 Projectlogin signinpr=new Projectlogin(driver);
			 
			 //signinpr.enterusernameandpassword("admin","admin");
			 
			 signinpr.enterusernameandpassword(userame, password);
			 signinpr.signinbutton();
			 
			 boolean ishomebuttondisplayed=signinpr.ishomebuttondisplayed();
			 Assert.assertTrue(ishomebuttondisplayed, Constant.ERROR_MESSAGE);
		}
		
		
		@Test
	    public void VerifyIsUserAbletoEnterValidUserNameandInvalidPassword() {
			
			Projectlogin signinpr=new Projectlogin(driver);
			 signinpr.enterusernameandpassword("admin","ad");
			 signinpr.signinbutton();
			 
			 boolean ishomebuttondisplayed=signinpr.ishomebuttondisplayed();
			 Assert.assertTrue(ishomebuttondisplayed, "homebutton is not found");
		}
		
		
		
		@Test
	    public void VerifyIsUserAbletoEnterInvalidUserNameandValidPassword() {
			Projectlogin signinpr=new Projectlogin(driver);
			 
			 signinpr.enterusernameandpassword("admi","admin");
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
		
		@DataProvider(name="credentials")//@Dataprovider annotation,object-class,data provider name=credentials
		
		public Object[][] testData()
		{
			
		
		Object data[][]= {{"admin","admin"},{"admin","adm"},{"a","admin"},{"ad","ad"}};
		
		return data;
		
		}
	 
	  
		
		
		}
		

	  

	
	
	
	
 