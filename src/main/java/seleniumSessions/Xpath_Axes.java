package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();//Top-casting
		 
		 driver.get("https://classic.freecrm.com/index.html");
		 
		 driver.findElement(By.name("username")).sendKeys("newautomation");
		 driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 Thread.sleep(6000);
		 
		 //NoSuchElementException: no such element:
		 //driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 
		 driver.switchTo().frame("mainpanel");
		 //driver.findElement(By.linkText("CONTACTS")).click();
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 
//		 selectContact("Romi singh");
//		 selectContact("Ali khan");
		 
		//a[text()='Ali khan']/parent::td/following-sibling::td
		 
//		 List<WebElement> Cont_Info=driver.findElements(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td"));
//		 
//		 for(WebElement e : Cont_Info) {
//			 String text=e.getText();
//			 if(text.length()!=0) {
//				 System.out.println(text);
//			 }
//		 }
		
		 getContactInfo("Ali khan");
		 
}
	public static ArrayList<String> getContactInfo(String username) {
		 
		 List<WebElement> Cont_Info=driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
		 ArrayList<String> info_List=new ArrayList<String>();
		 
		 for(int i=0;i<Cont_Info.size()-1;i++) {
			 String text=Cont_Info.get(i).getText();
			 
			 if(text.length()!=0) {
				 System.out.println(text);
				 info_List.add(text);
			 }
			
		 }
		 return info_List; 
	}
	
	public static void selectContact(String username) {
	String con_xpath="//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
	 driver.findElement(By.xpath(con_xpath)).click();
	}

}
