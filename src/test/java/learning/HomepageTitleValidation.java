package learning;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import resources.Base;

public class HomepageTitleValidation extends Base {
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException {
		
		driver = intializeBrowser();
		log.info("Browser Intialized");
		driver.get(prop.getProperty("Url"));	
		log.info("Url is opened");
	}
	
	@Test
	public void titleValidation() throws IOException {
		
		
		HomePageObjects l = new HomePageObjects(driver);
		Assert.assertEquals("FEATURED COURSES", l.titleName().getText());
		log.info("title vaidation completed");
	
		
	}
	@AfterTest
	public void close() {
		driver.close();
		
	}
	
	

}
