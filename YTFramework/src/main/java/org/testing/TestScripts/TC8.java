package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;


public class TC8 extends Base{
	
	
	@Test
	public void YTBestsongs() throws Exception
	{
		Login login= new Login(driver, pr);
		//login.signin("dillipsahooblr@gmail.com", "silicon756");
		login.signin("minalsahoo2018@gmail.com", "Abc@1234");
		//login.signin("dummywork78@gmail.com", "Dummy@123");
		Thread.sleep(2000);
		ScreenshotCapture.takeScreenshot("C://DillipData//first.png", driver);
		Thread.sleep(2000);
	    driver.findElement(By.xpath(pr.getProperty("LIBRARY"))).click();
	    Thread.sleep(2000);
	    Logout logout=new Logout(driver, pr);
	    logout.signout();

	}
	
	
		

	

}
