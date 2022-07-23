package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.ScreenshotCapture;


public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr; 
	}
	
	public void signin(String username,String password) throws Exception
	{
		//Click for SIGN IN page
		driver.findElement(By.xpath(pr.getProperty("SIGNIN"))).click();
		Thread.sleep(5000);
		//Enter the UserName here for Login
		WebElement user=driver.findElement(By.xpath(pr.getProperty("USERNAME")));
		user.sendKeys(username);
		driver.findElement(By.xpath(pr.getProperty("NEXT"))).click();
	    Thread.sleep(5000);
	    //Enter the Password here for Login
	     WebElement pass=driver.findElement(By.xpath(pr.getProperty("PASSWORD")));
	    pass.click();
	    pass.sendKeys(password);
	    driver.findElement(By.xpath(pr.getProperty("NEXT"))).click();
	    Thread.sleep(2000);
	    ScreenshotCapture.takeScreenshot("C://DillipData//login.png", driver);
		Thread.sleep(2000);
	   
	}

}
