package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorConcept {
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		 getRelativeElement("Lethbridge, Canada");
		driver.close();
	}

	public static void getRelativeElement(String cityName) {
	driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele=driver.findElement(By.linkText(""+cityName+""));
		
		//right of ele
		WebElement rightIndex=driver.findElement(with(By.tagName("p")).toRightOf(ele));
		System.out.println(rightIndex.getText());
		
		//left of ele
		WebElement leftIndex=driver.findElement(with(By.tagName("p")).toLeftOf(ele));
		System.out.println(leftIndex.getText());
		
		
		//Below
		WebElement belowCity=driver.findElement(with(By.tagName("p")).below(ele));
		System.out.println(belowCity.getText());
		
		//Above
		WebElement aboveCity=driver.findElement(with(By.tagName("p")).below(ele));
		System.out.println(aboveCity.getText());
	}
}
