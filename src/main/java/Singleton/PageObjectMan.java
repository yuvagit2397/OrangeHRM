package Singleton;

import org.openqa.selenium.WebDriver;

import pom.DashBoardPage;
import pom.LoginPage;
import stepDefinitions.ToGetPendingLeaveRequest;

public class PageObjectMan {
	public static WebDriver driver=ToGetPendingLeaveRequest.driver;
	
	private PageObjectMan() {
		
	}
	private static LoginPage lp;
	private static DashBoardPage dp;
	
	public static LoginPage getLp() {
		if (lp==null) {
			lp=new LoginPage(driver);
		}
		return lp;
	}
	
	public static DashBoardPage getDp() {
		if (dp==null) {
			dp=new DashBoardPage(driver);
		}
		return dp;
	}

}
