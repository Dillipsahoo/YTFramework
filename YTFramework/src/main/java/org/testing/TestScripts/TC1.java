package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Assertions.Assert1;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC1 extends Base{
	
	
	@Test
	public void YouTube() throws Exception
	{
		Login login= new Login(driver, pr);
		String expectedurl="https://www.youtube.com/";
		Assert.assertEquals(driver.getCurrentUrl(), expectedurl);
		Assert1.Assertion1(expectedurl, driver.getCurrentUrl());
		//login.signin("dummywork78@gmail.com", "Dummy@123");
		//login.signin("minalsahoo2018@gmail.com", "Abc@1234");
		login.signin("minalmamun44@gmail.com", "minal@123");
		
		Thread.sleep(2000);
		ScreenshotCapture.takeScreenshot("C://DillipData//first.png", driver);
		LogsCapture.takeCapture("TC1", "Login SuccesFully for TC1");
	    driver.findElement(By.xpath(pr.getProperty("GUIDE"))).click();
	    driver.findElement(By.xpath(pr.getProperty("EXPLORE"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(pr.getProperty("TRENDING"))).click();
	    LogsCapture.takeCapture("TC1", "Trending Clicked Succesfully");
	    Thread.sleep(4000);
	    Logout logout=new Logout(driver, pr);
	    logout.signout();
	    LogsCapture.takeCapture("TC1", "Logout SuccesFully for TC1");
	    LogsCapture.takeCapture("TC1", "Pass for TC1");

	}
	
	
		

	

}
