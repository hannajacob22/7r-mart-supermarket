package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.Pageutility;

public class Projectadminuser {

public WebDriver driver;
Pageutility utility=new Pageutility();

public  Projectadminuser(WebDriver driver)
{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);

}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement manageusersnew;

@FindBy(xpath="//input[@id='username']")WebElement adminusername;

@FindBy(xpath="//input[@id='password']")WebElement adminuserpassword;

@FindBy(xpath="//select[@id='user_type']")WebElement adminusertype;

@FindBy(xpath="//button[@name='Create']")WebElement adminusersave;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertnewuser;

public Projectadminuser isuserabletoclicknewbutton()
{
	manageusersnew.click();
	return this;
}

public Projectadminuser isuserabletoenterusername(String usernameadmin)
{
	adminusername.sendKeys(usernameadmin);
	return this;
}
public Projectadminuser isuserabletoenteruserpassword(String passworduser)
{
	adminuserpassword.sendKeys(passworduser);
	return this;
}

public Projectadminuser isuserabletoselectusertype()
{
	utility.selectByValue(adminusertype, "admin");
	 
	return this;
}
public Projectadminuser isuserabletoclicksavebutton()
{
	
	adminusersave.click();
	return this;
	
}
public boolean isuserabletocreatenewaccountsuccesfully()

{
	return alertnewuser.isDisplayed();
	
}
}
























//p[text()='Admin Users']