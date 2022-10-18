package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes_Assignment {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();//Top-casting
		  driver.manage().window().maximize();
		 
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(600,800)");
			Thread.sleep(3000);
		 
			//selectUsername("Joe.Root");
			
			getUserDetails("Joe.Root");
		
	}
	public static ArrayList<String> getUserDetails(String username) {
		String userList_xpath="//a[text()='"+username+"']/parent::td/following-sibling::td";
		List<WebElement>  userList=driver.findElements(By.xpath(userList_xpath));
		ArrayList<String> userValue=new ArrayList<String>();
		for(int i=0;i<userList.size();i++) {
			String text=userList.get(i).getText();
			if(text.length()!=0) {
				System.out.println(text);
				userValue.add(text);
			}
		}
		return userValue;
	}
	
	public static void selectUsername(String username) {
	
	 String check_xpath="//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']";
	 driver.findElement(By.xpath(check_xpath)).click();
	}

}
