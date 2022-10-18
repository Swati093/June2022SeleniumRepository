package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartTest {

	
 WebDriver driver;
	 
	 //with annotation,we don't use static method.
	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php");
		Thread.sleep(3000);
	}

	@Test
	public void searchTest() {
		boolean flag=driver.findElement(By.name("search")).isDisplayed();
		Assert.assertEquals(flag, true);
	}

	@Test
	public void pageTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Your Store");
	}

	

	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
}
