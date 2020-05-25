package pageObjects;

import java.util.ArrayList;

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
	
	public void reverseStr(String inputStr) {
		int n = inputStr.length();
		String reverseString = "";
		for (int i = n-1;i>=0;i--) {
			reverseString = reverseString + inputStr.charAt(i);
		}
		System.out.println("Reverse string is "+reverseString);
	}
	
	public void printPrimeNum(int num) {
		
		if (num>=1) {
			 System.out.println("First "+num+" prime numbers are:");
	         System.out.println(2);
		}
		int value = 3;
		int prime = 1;
		for (int i=2;i<num;) {
			for (int j=2;j<=(value/2);j++) {
				int rem = value%j;
				if (rem==0) {
					prime = 0;
					break;
				}	
			}
			if (prime == 1) {
				System.out.println(value);
				i++;
			}
			prime = 1;
			value++;
			
		}	
	}

	
}
