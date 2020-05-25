package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver ;
	public Properties prop;
	public WebDriver intializeBrowser() throws IOException {
		String path = System.getProperty("user.dir")+"\\Settings\\settings.properties";
		prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		String browserPath = System.getProperty("user.dir")+"\\Browser\\";
		if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", browserPath+"chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("headless");
			driver = new ChromeDriver(options);			
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenuium Jar\\ch\\chromedriver.exe");
			driver = new FirefoxDriver();		
		}else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenuium Jar\\ch\\chromedriver.exe");
			driver = new ChromeDriver();		
		}		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public String getScreenshot(String caseName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String filePath = System.getProperty("user.dir")+"\\reports\\screens\\"+caseName+".png";
		FileUtils.copyFile(src,new File(filePath));
		return filePath;
	}
	
	
	
	
}
