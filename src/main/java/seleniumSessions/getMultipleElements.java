package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getMultipleElements {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();//Top-casting
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> listLink = driver.findElements(By.tagName("a"));
		
		int totalLink = listLink.size();
		System.out.println(totalLink);
		
//		for(int i=0; i<totalLink ; i++ ) {
//			String text = listLink.get(i).getText();
//			
//			if(text.length()!=0) {
//			System.out.println(text);
//		}
//		}
		
//		for(WebElement e : listLink) {
//			String textVal = e.getText();
//			String hyperLinkVal = e.getAttribute("href");
//			
//			if(textVal.length()!=0 ) {
//			
//			System.out.println(textVal +" : "+hyperLinkVal);
//			}
//		}
		
		By linkName= By.tagName("a");
		ArrayList<String> textList = getElementsByText(linkName);
		for(String e: textList) {
			if(e.contains("Media")) {
				System.err.println("PASS");
			}
		}
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static ArrayList<String> getElementsByText(By locator) {
		List<WebElement> listLink = getElements(locator);
		ArrayList<String> textArray=new ArrayList<String>();
		for(WebElement e : listLink) {
			String text = e.getText();
			if(text.length()!=0) {
			textArray.add(text);
			}
			}
		return textArray;
	}
}
