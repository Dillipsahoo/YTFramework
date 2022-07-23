package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;


public class TC6 extends Base{
	
	
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
	    WebElement video=driver.findElement(By.id(pr.getProperty("VIDEO")));
        video.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(pr.getProperty("DOT"))).click();
	    Actions ac= new Actions(driver);
	    int i=0;
	    while(driver.findElements(By.xpath(pr.getProperty("COMMENT"))).size()==0)
	    {
	    	while(i<2)
	    	{
	    	ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	    	ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	    	i++;
	    	}
	    	Thread.sleep(4000);
	    }		
	    driver.findElement(By.cssSelector(pr.getProperty("SELECT"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(pr.getProperty("COMMENTWRITE"))).sendKeys("This is an automated message for youtube");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("COMMENTSUBMIT")).click();
	    Thread.sleep(4000);
	    Logout logout=new Logout(driver, pr);
	    logout.signout();

	}
	
	
		

	

}
