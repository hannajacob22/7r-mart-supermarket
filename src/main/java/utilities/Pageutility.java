package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pageutility {
	
 WebDriver driver;
 public void selectByValue(WebElement element,String value)
 {
	 Select usertype=new Select(element);
		
	 usertype.selectByValue(value);
 }
 
 
 public void selectByValue1(WebElement element,String value)
 {
	 Select usertype1=new Select(element);
		
	 usertype1.selectByValue("Staff");
 }
 
 public void selectByValue2(WebElement element,String value)
 {
	 Select usertype2=new Select(element);
		
	 usertype2.selectByValue("Partner");
	 
 }
 public void selectByValue3(WebElement element,String value)
 {
	 Select usertype3=new Select(element);
		
	 usertype3.selectByValue("Delivery Boy");
	 
 }
 public void selectByValue4(WebElement element,String value)
 {
	 Select usertype4=new Select(element);
		
	 usertype4.selectByValue("onion");
	 
 }
 
 
 
}
