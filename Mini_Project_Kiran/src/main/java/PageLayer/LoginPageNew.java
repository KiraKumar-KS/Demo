package PageLayer;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class LoginPageNew extends Base {

	@FindBy(xpath = "//input[@name='uid']")
	WebElement userid;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginbtn;

	// Initializing the Page Objects:
	public LoginPageNew() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Action - validate Login and action on Elements
	public HomePage login22(String un, String pwd) throws IOException {
		/*
		 * Performing actions on identified objects
		 */
		userid.sendKeys(un);
		password.sendKeys(pwd);
		// LocationChoose.click();
		loginbtn.click();
		return new HomePage();
	}
}
