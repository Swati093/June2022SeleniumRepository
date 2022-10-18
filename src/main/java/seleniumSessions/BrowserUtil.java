package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	private WebDriver driver;
	/**
	 * This method is used to initialize the browser on the basis of browser we are passing
	 * @param browser
	 */
	public WebDriver launchBrowser(String browser) {
		System.out.println("The browser is:"+browser);
		
		switch (browser.toLowerCase()) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please paaa the right browser....");
			break;
		}
		return driver;
	}
	
	public void launchURL(String url) throws Exception {
		
		if(url.length()==0) {
			System.out.println("URL is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		if(url.indexOf("http")!=0 && url.indexOf("https")==0) {
			System.out.println("Http(s) is missing");
			throw new Exception("HTTP(S)ISMISSINGEXCEPTION");
		}
		if(url == null) {
			System.out.println("URL is null");
			throw new Exception("URLISNULLEXCEPTION");
		}
		
		driver.get(url);
	}
	
	public String getPageTitle() {
		String title=driver.getTitle();
		System.out.println("Title is:"+title);
		if(title!=null) {
			return title;
		}
		else {
			System.out.println("Page title is null...");
			return null;
		}
	
	}
	public String getPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println("Title is:"+url);
		if(url!=null) {
			return url;
		}
		else {
			System.out.println("Page url is null...");
			return null;
		}
	
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
	

}
