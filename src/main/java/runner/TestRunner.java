package runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import propertyFile.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\yuvasri_revision\\OrangeHRM\\src\\main\\java\\featureFile\\OrangeHrmDashBoard.feature",
				glue = "stepDefinitions", dryRun = false, monochrome = true,
				plugin="html:HtmlReport.html")



public class TestRunner {
	public static WebDriver driver;
	/*public static ExtentReports extentReports;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest testCases;
	public static void extentReport() {
		extentReports=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter("D:\\yuvasri_revision\\OrangeHRM\\ExtentReports\\extent.html");
		extentReports.attachReporter(htmlReporter);
		
	}*/
	@BeforeClass
	public static void browserLaunch() throws IOException {
		String browser = FileReaderManager.getInstances().getBrowser();
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		//extentReport();
		//testCases=extentReports.createTest("To Get Pending Leave Request ");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		//extentReports.flush();
		driver.quit();
	}

}
