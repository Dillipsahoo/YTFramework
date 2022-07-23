package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

public ChromeDriver driver;
public Properties pr;
	
    //Open the Browser with Youtube
	@BeforeMethod
	public void openBrowser() throws InterruptedException, IOException
	{
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 
		driver = new ChromeDriver(options); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		options.addArguments("--disable-notifications");
		Thread.sleep(5000);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        File  f = new File("../YTFramework/Objects.properties");
        pr=new Properties();
        FileInputStream fi=new FileInputStream(f);
        pr.load(fi);   
	}
	
	//Close the Browser
	/*@AfterMethod
	public void closeBrowser()
	{
		 driver.quit();
    }
*/

}
