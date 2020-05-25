package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}
	
	WebDriver driver;
	By emailID = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By Loginbtn = By.xpath("//input[@value='Log In']");	

	public WebElement emailID() {
		return driver.findElement(emailID);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement login() {
		return driver.findElement(Loginbtn);
	}
	

	
	
	
}
