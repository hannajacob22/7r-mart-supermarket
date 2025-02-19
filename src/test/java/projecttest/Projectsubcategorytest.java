package projecttest;

import java.io.IOException;

import org.testng.annotations.Test;

import project.Projecthome;
import project.Projectlogin;
import project.Projectsubcategory;
import utilities.Excelutilities;

public class Projectsubcategorytest extends Base {
  @Test
  public void isuserabletoaddsubcategory() throws IOException {
	  
    Projecthome homepage;
    Projectsubcategory subcategorypr;
	
	
	  
	  String username=Excelutilities.getStringdata(1, 0,"loginpagetest");
	  String password=Excelutilities.getStringdata(1, 1,"loginpagetest");
		
	   Projectlogin signinpr=new Projectlogin(driver);
	   
		 signinpr.enterusernameandpassword(username,password);
		 signinpr.signinbutton();
		 
		 homepage=signinpr.signinbutton();
		subcategorypr=homepage.isuserabletocllicksubcategory();
		subcategorypr.isuserabletoclicksubcategorynew();
	    subcategorypr.isuserabletoentercategorysub();
	    subcategorypr.isuserabletoentersubcategory("orange");
	    subcategorypr.isuserabletouploadfile();
	    subcategorypr.isuserabletosaveuploadedfile();
  }
}
