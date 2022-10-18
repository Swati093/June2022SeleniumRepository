package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public  void  doSendKeys(By locator,String text) {
		 getElement(locator).sendKeys(text);
	}
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public  int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public  ArrayList<String> getElementsByText(By locator) {
		List<WebElement> listLink = getElements(locator);
		ArrayList<String> textArray=new ArrayList<String>();
		for(WebElement e : listLink) {
			String text = e.getText();
			textArray.add(text);
			}
		return textArray;
	}
	
}
