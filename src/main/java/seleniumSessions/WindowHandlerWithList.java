package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> handlesList=new ArrayList<String>(handles);
		
		String parentWindow=handlesList.get(0);
		String childWindow=handlesList.get(1);
		
		System.out.println(driver.getTitle());

		driver.switchTo().window(childWindow);
		driver.findElement(By.name("first_name")).sendKeys("Swati");
		Thread.sleep(3000);
		System.out.println("Child window title is:"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title is:"+driver.getTitle());
		
		driver.quit();
	}

}
