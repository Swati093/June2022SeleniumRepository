package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementApproaches {
  static WebDriver driver;
	public static void main(String[] args) {
		
		
	
// Create an element + perform action(click,sendKeys,getText,isDispalyed)

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 //1.
		/*driver.findElement(By.id("input-email")).sendKeys("swati@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("swati@123");*/
		
		//2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("swati@gmail.com");
//		password.sendKeys("swati@123");
		
		//3.By Locator: OR(Object repository)
//		By idField = By.id("input-email");
//		By passField = By.id("input-password");
//		
//		WebElement email = driver.findElement(idField);
//		WebElement password = driver.findElement(passField);
//		
//		email.sendKeys("swati@gmail.com");
//		password.sendKeys("swati@123");
//		
//		4.By locator + generic function
//	By idField = By.id("input-email");
//	By passField = By.id("input-password");
//	
//	getElement(idField).sendKeys("swati@gmail.com");
//	getElement(passField).sendKeys("swati@123");
		
		//5. By locator + generic function + action
		
//		By idField = By.id("input-email");
//		By passField = By.id("input-password");
//		
//		doSendKeys(idField, "swati@gmail.com");
//		doSendKeys(passField, "swati@123");
		
		//6.By locator + ElementUtil --> generic function
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By idField = By.id("input-email");
		By passField = By.id("input-password");
		eleUtil.doSendKeys(idField, "swati@gmail.com");
		eleUtil.doSendKeys(passField, "swati@123");
//		
//	 7.By locator + browserUtil + ElementUtil
//	
	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
		
	//}
	
//	public static void  doSendKeys(By locator,String text) {
//		 getElement(locator).sendKeys(text);
//	}
}

