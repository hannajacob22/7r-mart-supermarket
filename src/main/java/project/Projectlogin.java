package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Projectlogin {
	
	public WebDriver driver;
	
	public  Projectlogin(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@type='text']")WebElement username;
	@FindBy(xpath="//input[@type='password']")WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")WebElement signin;
	@FindBy(xpath="//a[text()='Home']")WebElement hometext;
	
	
	
	
	public Projectlogin enterusernameandpassword(String username1,String password1)
	{
		username.sendKeys(username1);
		password.sendKeys(password1);
		return this;
		
	}
		public Projecthome signinbutton()
		{
		signin.click();
		return new Projecthome(driver);
		

}
		public boolean ishomebuttondisplayed()
		{
			return hometext.isDisplayed();
			
		}
}
