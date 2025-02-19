package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Projecthome {
	
	
	public WebDriver driver;
		
		
		public Projecthome (WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver, this); 
			
		}
		@FindBy(xpath="//p[text()='Manage News'][1]")WebElement managenews;
		
		@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin ;
		
		@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]")WebElement logout;
		
		@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")WebElement adminusers;
		
		@FindBy(xpath="(//a[@class='small-box-footer'])[3]")WebElement category;   
		
		@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category'])[1]")WebElement subcategory;
		//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'])[4]"
		
		public Projecthome isUserAccountClick()
		{
			admin.click();
			return this;
		}
		
		public Projecthome	isLogOutAccount()
			{
			 logout.click();
			 return this;
		}
		public Projectmanagenews isuserabletocllickmanagenewsbutton()
			{
			 managenews.click();
			 return new Projectmanagenews(driver);
		}
		
		public Projectadminuser isuserabletocllickadminusers()
		{
		 adminusers.click();
		 return new Projectadminuser(driver);
	}
		
		
		public Projectcategory isuserabletocllickcategory()
		{
		 category.click();
		 return new Projectcategory(driver);
	}
		
		public Projectsubcategory isuserabletocllicksubcategory()
		{

		subcategory.click();
		return new Projectsubcategory(driver);
		
}
}

	


