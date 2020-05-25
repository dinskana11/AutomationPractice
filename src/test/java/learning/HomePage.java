package learning;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import resources.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException {	
		driver = intializeBrowser();	
		log.info("Browser Intialized");
		
		
	}
	@Test
	public void loginPageNav() throws IOException {
		
		driver.get(prop.getProperty("Url"));
		log.info("Url is opened");
		HomePageObjects l = new HomePageObjects(driver);
		l.clickLogin().click();	
		log.info("login buttom is clicked");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	
	
		

}
