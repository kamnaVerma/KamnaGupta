package com.firstproject.testCases;


import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.firstproject.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	
	
	public String url=readConfig.getWebAppUrl();
	public String username=readConfig.getUname();
	public String password=readConfig.getPwd();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		logger = Logger.getLogger("MavenFirstProject");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriver());
			driver = new ChromeDriver();	
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriver());
			driver = new ChromeDriver();			
		}
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		logger.info("Url Opened");
		//Thread.sleep(1000);
	
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}

