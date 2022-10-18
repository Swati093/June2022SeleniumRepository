package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. //tagName[@attr='value']
		
		//input[@name='email']
		
		
		//2.htmltag with multiple attribute: 'and' ,'or' 
		
		//htmltag[@attr1='value' and @attr2='value']
		//htmltag[@attr1='value' or @attr2='value']
		//input[@name='email' and @placeholder='Email address']
		//input[@placeholder='E-Mail Address' and @class='form-control' ]
		//input[@id='input-email' or @name='email' ]
		
		//text()
		//htmltag[text(),'value']
		
		//Contains() with attr
		//input[contains(@placeholder,'First')]
		//input[contains(@id,'firstname')]
		
		//contains() with text()
		//htmltag[contains(text(),'value')]
		//a[contains(text(),'Forgotten')]
		
		//contains() with attr and text()
		//htmltag[contains(@attr,'value') and contains(text(),value)]
		//a[contains(@class,'list-group-item') and contains(text(),'Forgotten Password')]
		
		//contains() with attr1 and att2
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
	
		
		//start_with():
		//htmltag[starts-with(@attr,'value')]
		//htmltag[starts-with(text(),'value')]
		//a[starts-with(text(),'Fresh')]
		
		//last():
		//(//xpath)[last()]
		//(//xpath)[last()-1] --> second last 
		// (//input[@class='form-control' ])[last()]
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();//Top-casting
		
//		driver.get("https://www.amazon.com/");
//		By help=By.xpath("(//div[@class='navFooterVerticalColumn navAccessibility']//a)[last()]");
//		System.out.println(driver.findElement(help).getText());
		
		 //driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 driver.get("https://app.hubspot.com/login/");
		
		 
		 //InvalidSelectorException : invalid xpath or any locator
		 //driver.findElement(By.xpath("//////input[#$//#id='input-email']")).sendKeys("swati123@gmail.com");
		 
		 //invalid
		 //InvalidSelectorException: Compound class names not permitted
		 //driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("swati123@gmail.com");
		 
		 //valid: xpath will consider all the classes as combined value
		 //driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("swati123@gmail.com");
		 
		 //form-control private-form__control login-email
		 //form-control private-form__control login-password m-bottom-3
		 
		 //valid
		 //classname : only one single classname is allowed;if compound class, choose a unique one.
//		 driver.findElement(By.className("login-email")).sendKeys("swati123@gmail.com");
//		 driver.findElement(By.className("login-password")).sendKeys("swati@123");
		 
		 //invalid as xpath will consider all the classes as combined value
		 driver.findElement(By.xpath("//input[@class='private-form__control login-email']")).sendKeys("swati123@gmail.com");
		 
		 //NSE exception
		 driver.findElement(By.xpath("//input[@class='private-form__control login-email']")).sendKeys("swati123@gmail.com");
		
	}

}
