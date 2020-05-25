package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public HomePageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	
	
	WebDriver driver;
	By loginBtn = By.xpath("//span[text()='Login']");
	By titleContent = By.xpath("//div[@class='text-center']/h2");
	public WebElement clickLogin() {
		return driver.findElement(loginBtn);
	}
	
	public WebElement titleName() {
		return driver.findElement(titleContent);
	}

}
