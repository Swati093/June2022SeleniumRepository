package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	static WebDriver driver;
	
	public static void main(String[] args) {
			//open browser : Chrome
			//launch url : www.google.com
			//get the title
			//verify the title: act vs exp
			//close the browser
		 
	/*	System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		String browser="chrome";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:/Users/HP/Downloads/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please paaa the right browser....");
			break;
		}
		
		//driver.get("www.google.com"); //InvalidArgumentException
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		
		System.out.println("Title is:"+title);
		String url=driver.getCurrentUrl();
		System.out.println("url is:"+url);
		
		if(title.equals("Google")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
