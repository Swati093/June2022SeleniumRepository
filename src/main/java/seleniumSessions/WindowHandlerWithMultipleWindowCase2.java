package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithMultipleWindowCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		String parentWindowID=driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click();
		
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		while(it.hasNext()) {
			String windowID=it.next();
			//System.out.println(driver.getTitle());
			if(!windowID.equals(parentWindowID)) {
				driver.switchTo().window(windowID);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.close();
				driver.switchTo().window(parentWindowID);
				System.out.println(driver.getTitle());
			}
			
		}
		driver.close();	
		
		
		
		
		
		
	}
		
	}
	

