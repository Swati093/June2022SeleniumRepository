package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		// comma css
		String manFieldList="input#username,input#password,button#loginBtn,small#password-description";
		
		List<WebElement> manFieldVal=driver.findElements(By.cssSelector(manFieldList));
		System.out.println(manFieldVal.size());
		
		if(manFieldVal.size() == 4) {
			System.out.println("Pass");
		}
		
		//not css
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		//.form-control.private-form__control:not(input#username)
		// .form-control.private-form__control:not(input[type='password'])
		
		driver.close();
	}

}
