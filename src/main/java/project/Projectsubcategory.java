package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import constant.Constant;
import utilities.Fileupload;
import utilities.Waitutility;
import utilities.Pageutility;

public class Projectsubcategory
{
	Waitutility waitutility=new Waitutility();
	Fileupload fileupload = new Fileupload();
	Pageutility pageutility=new Pageutility();
	
		WebDriver driver;

		public  Projectsubcategory(WebDriver driver)
		{
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);

		}	

		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement subcategorynew;
		@FindBy(xpath="//select[@id='cat_id']")WebElement entercategorysub;  
		@FindBy(xpath="//input[@id='subcategory']")WebElement subcategory; 
		@FindBy(xpath="//input[@id='main_img']")WebElement choosefilesub;
		@FindBy(xpath="//button[@class='btn btn-danger']")WebElement savefilesub;
		
		
		public Projectsubcategory isuserabletoclicksubcategorynew()
		{
			subcategorynew.click();
			return this;
			
		}
		
		public Projectsubcategory isuserabletoentercategorysub()
		{
			
			pageutility.selectByValue4(entercategorysub, "onion");
			 return this;
		}
		
		public Projectsubcategory isuserabletoentersubcategory(String subcategorynew)
		{
			
			subcategory.sendKeys(subcategorynew);
			 return this;
		}
		
		public Projectsubcategory isuserabletouploadfile()
		{
			
			waitutility.waitforelementtoclick(driver,choosefilesub);
			
			fileupload.sendkeyforfileupload(choosefilesub, Constant.FILEPATH2);
			
			return this;
			 
		}
		public Projectsubcategory isuserabletosaveuploadedfile()
		{
			
			savefilesub.click();
			return this;
			
		}
		/*public boolean isNewSubCategoryAdded()
		{
		return subCategoryAlert.isDisplayed();
		}*/
		
		}
		
		
		
		



