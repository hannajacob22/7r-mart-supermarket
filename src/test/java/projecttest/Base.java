package projecttest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
  
	public WebDriver driver;
	
    @BeforeMethod
    
    public void beforeMethod() {
	  
    	 driver=new ChromeDriver();
 		
   	  driver.get("https://groceryapp.uniqassosiates.com/admin/login");//launch URL
   				
   	  driver.manage().window().maximize();  
   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//all elemets
   	  
	  
  }

 
}
