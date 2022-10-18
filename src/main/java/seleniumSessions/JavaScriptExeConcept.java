package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExeConcept {

	public static void main(String[] args) {
		
		//CD - RWD --WD
		//RWD -- JSE
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		WebElement signUp=driver.findElement(By.linkText("Sign Up"));
		
	//JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("alert('Hello World')");
		
	JavaScriptUtil jsu=new JavaScriptUtil(driver);
//		jsu.generateAlert("Hello World");
		
		//jsu.generateConfirmPopUp("Are you sure you want to proceed?");
	
//	String innerText=jsu.getInnerText();
//	System.out.println(innerText);
	jsu.clickElementByJS(signUp);

	}

}
