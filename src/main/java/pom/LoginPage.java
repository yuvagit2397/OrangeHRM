package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;

@FindBy(id="txtUsername")
public static WebElement userName;
public static WebElement getUserName() {
	return userName;
}

@FindBy(id="btnLogin")
public static WebElement login;
public static WebElement getlogin() {
	return login;
}
	
@FindBy(id="txtPassword")
public static WebElement passWord;
public static WebElement getpassWord() {
	return passWord;
	}
	

public LoginPage(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}

}
