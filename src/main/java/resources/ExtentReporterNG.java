package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports extent;
	 
	public static ExtentReports getReporterObj() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Validation");
		reporter.config().setDocumentTitle("QA Click Academy page validation");
		
		extent =  new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Dinku");	
		return extent;
		
	}
	

}
