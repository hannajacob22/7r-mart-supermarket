package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Fileupload;
import utilities.Waitutility;
import constant.Constant;


public class Projectcategory {
	
Waitutility waitutility=new Waitutility();
Fileupload fileupload = new Fileupload();

WebDriver driver;

public  Projectcategory(WebDriver driver)
{
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);

}	

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")WebElement categorynew;
@FindBy(xpath=" //input[@placeholder='Enter the Category']")WebElement entercategory;  
@FindBy(xpath=" //input[@id='main_img']")WebElement choosefile; 
@FindBy(xpath="//button[@type='submit']")WebElement savefile;


public Projectcategory isuserabletoclicknewbutton()
{
	categorynew.click();
	return this;
}

public Projectcategory isuserabletoentercategory(String category)
{
	entercategory.sendKeys(category);
	
	return this;
}


public Projectcategory isuserabletochoosefile()
{
	//choosefile.click();
	
	
	
	waitutility.waitforelementtoclick(driver,choosefile);
	
	
	
	fileupload.sendkeyforfileupload(choosefile, Constant.FILEPATH1);
	
	return this;
}

public Projectcategory isuserabletosavefile()
{
	waitutility.waitforelementtoclick(driver,savefile);
	savefile.click();
	return this;
}


}
