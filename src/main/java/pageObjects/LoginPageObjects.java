package pageObjects;

import java.util.ArrayList;

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
	public void stringCount(String inputStr) {
		String val = inputStr.replace(" ", "");
		System.out.println(val);
		int n = val.length();
		System.out.println(n);
		int k = 0;
		ArrayList<Character> newValue = new ArrayList<Character>();
		for(int i=0;i<n;i++) {
			if(!newValue.contains(val.charAt(i))) {
				newValue.add(val.charAt(i));
				k++;			
			}			
		}
		System.out.println("Total unique characters in Given String is "+k);
		System.out.println("The characters are as "+newValue);
		
	}

	
	
	
}
