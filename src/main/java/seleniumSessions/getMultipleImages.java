package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getMultipleImages {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();//Top-casting
		
		driver.get("https://www.amazon.com/");
		
//		List<WebElement> listImages = driver.findElements(By.tagName("img"));
//		System.out.println();
//		
//		for(WebElement e: listImages) {
//			String altVal=e.getAttribute("alt");
//			String srcVal = e.getAttribute("src");
//			System.out.println(altVal+" : "+srcVal);
//		}
		
		By img=By.tagName("img");
		By link=By.tagName("a");
		
		System.out.println("Total no. of images:"+ getElementsCount(img));
		System.out.println("Total no. of links:"+ getElementsCount(link));
		
		int linkCount = getElementsCount(link);
		
		if(linkCount>200) {
			System.out.println("Pass");
		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public static ArrayList<String> getElementsByText(By locator) {
		List<WebElement> listLink = getElements(locator);
		ArrayList<String> textArray=new ArrayList<String>();
		for(WebElement e : listLink) {
			String text = e.getText();
			textArray.add(text);
			}
		return textArray;
	}
	
	
}
