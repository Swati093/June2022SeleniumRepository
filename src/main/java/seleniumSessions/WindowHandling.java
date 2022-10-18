package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String  parentWindowID = it.next();
		System.out.println("Parent window id is:"+parentWindowID);
		
		String childWindowID=it.next();
		System.out.println("Child window id is:"+childWindowID);
		
		driver.switchTo().window(childWindowID);
		driver.findElement(By.name("first_name")).sendKeys("Swati");
		Thread.sleep(3000);
		System.out.println("Child window title is:"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is:"+driver.getTitle());
		
		driver.quit();
	}

}
