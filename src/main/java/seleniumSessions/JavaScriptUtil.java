package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	private WebDriver driver;
	
	public JavaScriptUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public void generateAlert(String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	public void generateConfirmPopUp(String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("confirm('"+message+"')");
	}


	public void refreshBrowserByJS() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	public void goBackByJS() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(-1)");
	}
	public void goForwardByJS() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(1)");
	}
	
	public String getInnerText() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js.executeScript("return document.documentElement.innerText").toString();
	}
	
	public String getTitleByJS() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js.executeScript("return document.title").toString();
	}
	
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	
	
	
	
	
	
	
	
	
}
