package seleniumSessions;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		String parentWindowID=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
