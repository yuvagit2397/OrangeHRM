package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	public static WebDriver driver;
	
	@FindBy(xpath="//fieldset[@id='panel_resizable_1_2']/legend")
	public static WebElement verifyPendingLeaveText;
	public static WebElement getVerifyPendingLeaveText() {
		return verifyPendingLeaveText;
	}
	
	@FindBy(id="dashboard__pendingLeaveRequests")
	public static List<WebElement> dashboard__pendingLeaves ;
	public static List<WebElement> getDashboard__pendingLeaves() {
		return (List<WebElement>) dashboard__pendingLeaves;
	}
	public DashBoardPage(WebDriver Ddriver) {
		this.driver=Ddriver;
		PageFactory.initElements(driver, this);
	}
}
