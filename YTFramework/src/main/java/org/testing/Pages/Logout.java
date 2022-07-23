package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.ScreenshotCapture;

public class Logout {

	ChromeDriver driver;
	Properties pr;
	
	public Logout(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr; 
	}
	//Signout from YouTube
	public void signout() throws Exception
	{
		driver.findElement(By.xpath(pr.getProperty("USERPROFILE"))).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(pr.getProperty("SWITCHACCOUNT"))).click();
		driver.findElement(By.xpath(pr.getProperty("SIGNOUT"))).click();
		ScreenshotCapture.takeScreenshot("C://DillipData//logout.png", driver);
		Thread.sleep(2000);
		
	}
}
