package projecttest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import project.Projectcategory;
import project.Projecthome;
import project.Projectlogin;
import utilities.Excelutilities;

public class Projectcategoryfileuploadtest extends Base{
  @Test
  public void isuserabletoaddnewcategory() throws IOException {
	 
	  Projecthome homepage;
	
	
	  
	  String username=Excelutilities.getStringdata(1, 0,"loginpagetest");
	  String password=Excelutilities.getStringdata(1, 1,"loginpagetest");
		
	   Projectlogin signinpr=new Projectlogin(driver);
	   
		 signinpr.enterusernameandpassword(username,password);
		 signinpr.signinbutton();
		 
		 homepage=signinpr.signinbutton();
		 homepage.isuserabletocllickcategory();
		  
		  Projectcategory categorypr=homepage.isuserabletocllickcategory();
		  categorypr.isuserabletoclicknewbutton();
		  categorypr.isuserabletoentercategory("onion");
		  categorypr.isuserabletochoosefile();
		  categorypr.isuserabletosavefile();
		 
		  
		 
		 
		
	  
	  
  }
}
