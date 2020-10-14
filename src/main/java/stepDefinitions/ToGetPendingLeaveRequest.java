package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

import Singleton.PageObjectMan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.BaseClass;
import propertyFile.ConfiqReader;
import propertyFile.FileReaderManager;
import runner.TestRunner;

public class ToGetPendingLeaveRequest extends BaseClass {
public static WebDriver driver=TestRunner.driver;
public static ExtentReports extentReports;
public static ExtentHtmlReporter htmlReporter;
public static ExtentTest testCases;
@Given("User is on the login page")
public void user_is_on_the_login_page() throws IOException {
	String url = FileReaderManager.getInstances().getUrl();
	driver.get(url);
}
@When("user enters  valid username and password")
public void user_enters_valid_username_and_password() throws Exception {
	
	PageObjectMan.getLp().userName.sendKeys("admin");
	PageObjectMan.getLp().passWord.sendKeys("admin123");
	//BaseClass.ScreenShot("loginPage.png");
	//TestRunner.testCases.addScreenCaptureFromPath("loginPage.png");
	PageObjectMan.getLp().login.click();
}

@Then("user should see the dashboard page")
public void user_should_see_the_dashboard_page() throws IOException {
	String actual="Pending Leave Requests";
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("DashBoard.jpeg");
	org.openqa.selenium.io.FileHandler.copy(src, des);
	testCases.addScreenCaptureFromPath("DashBoard.jpeg");
	
	String expected = PageObjectMan.getDp().verifyPendingLeaveText.getText();
	System.out.println("actual "+ actual);
	System.out.println("expected "+expected);
	
	Assert.assertEquals(expected, actual);
	System.out.println("Assertion verified");
	
}

@Then("user validating the pending leave request")
public void user_validating_the_pending_leave_request() {
	List<WebElement> leaves = PageObjectMan.getDp().dashboard__pendingLeaves;
	for (WebElement pendingLeave : leaves) {
		String leavetxt = pendingLeave.getText();
		System.out.println(leavetxt);
	}



}
}
