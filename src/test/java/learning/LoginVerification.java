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

public class LoginVerification extends Base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException {
		
		driver = intializeBrowser();	
		log.info("Browser Intialized");
		
		
	}
	
	@Test(dataProvider = "getData")
	public void loginApplication(String userName, String password) throws IOException {
		
		driver.get(prop.getProperty("Url"));
		log.info("Url is opened");
		HomePageObjects l = new HomePageObjects(driver);
		l.clickLogin().click();
		log.info("login button is clicked");
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.emailID().sendKeys(userName);
		lp.password().sendKeys(password);
		lp.login().click();
		log.info("login verified");
	
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object [][] data = new Object[2][2];
		data[0][0] = "dinskana@gmail.com";
		data[0][1] = "123241241";
		data[1][0] = "rose.manju@gmail.com";
		data[1][1] = "5r6t7890";
		
		return data;
		
	}

}
