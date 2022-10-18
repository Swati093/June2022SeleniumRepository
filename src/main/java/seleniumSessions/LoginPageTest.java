package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) throws Exception {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.launchBrowser("Chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		brUtil.getPageTitle();
		brUtil.getPageURL();
		
		By idField = By.id("input-email");
		By passField = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(idField, "test@gmail.com");
		eleUtil.doSendKeys(passField, "test@123");
		
	}

}
