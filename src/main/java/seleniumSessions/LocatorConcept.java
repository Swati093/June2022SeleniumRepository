package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	 static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		String headerText=driver.findElement(By.tagName("h1")).getText();
		
		By header=By.tagName("h1");
		String actHeader=doGetText(header);
		if(actHeader.equals("Register Account")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

}
