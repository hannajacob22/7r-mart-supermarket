package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projectmanagenews {

public WebDriver driver;

public Projectmanagenews(WebDriver driver)

{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

 @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
 @FindBy(xpath="//textarea[@id='news']")WebElement enternews;
 @FindBy(xpath="//button[@type='submit']")WebElement savebutton;
 
 @FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
 
 
 public void isuserabletoclicknewbutton()
 {
	 newbutton.click();

}
 public void isuserabletoenternews(String news)
 {
	 enternews.sendKeys(news);
 }
 
 public void isuserabletoclicksavebutton()
 {
	 savebutton.click();
 }
 
 
 public boolean isuserabletocreatenewnewsuccesfully()
 {
 return alert.isDisplayed();
 }
 
}
 
 
 
