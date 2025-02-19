package projecttest;

import utilities.Screenshotutility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class Baseclassnew {
	
	
	WebDriver driver;
  
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver=new ChromeDriver();
		  driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//wait apply to all elements
	  }

	  @AfterMethod
	  public void afterMethod(ITestResult itResult) throws IOException 
	  
	  {  
		  if (itResult.getStatus() == ITestResult.FAILURE) {
				Screenshotutility sc = new Screenshotutility();
				sc.captureFailureScreenShot(driver, itResult.getName());
			}
			if (driver != null) {
				driver.quit();
			}

		  
	  }
	  

	   

}
