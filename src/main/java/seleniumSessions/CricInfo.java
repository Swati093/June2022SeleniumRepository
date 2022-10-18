package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/new-zealand-a-in-india-2022-1329818/india-a-vs-new-zealand-a-2nd-unofficial-test-1329822/full-scorecard");
		Thread.sleep(4000);
		//getWktTakerName("Abhimanyu Easwaran");
		//playerScoreCard("Abhimanyu Easwaran");
		
		getBowlerDetails("Benjamin Lister");
	
		
	}
	
	public static ArrayList<String> getBowlerDetails(String name) {
		String bowler_xpath="//span[text()='"+name+"']/ancestor::td/following-sibling::td";
		List<WebElement> bowler_detail=driver.findElements(By.xpath(bowler_xpath));
		ArrayList<String> scoreValue=new ArrayList<String>();
		
		for(WebElement e: bowler_detail) {
			String text=e.getText();
			if(text.length()!=0) {
				System.out.println(text);
				scoreValue.add(text);
			}
		}
		return scoreValue;
	}
	
	public static ArrayList<String> playerScoreCard(String name) {
		String player_xpath="//span[text()='"+name+"']/ancestor::td/following-sibling::td";
		List<WebElement> player_detail=driver.findElements(By.xpath(player_xpath));
		ArrayList<String> scoreValue=new ArrayList<String>();
		
		for(WebElement e: player_detail) {
			String text=e.getText();
			if(text.length()!=0) {
			System.out.println(text);
			scoreValue.add(text);
			}
		}
		return scoreValue;
		
	}
	
	public static String getWktTakerName(String name) {
		String wkt_xpath="//span[text()='"+name+"']/ancestor::td/following-sibling::td";
		String wkt_takername=driver.findElement(By.xpath(wkt_xpath)).getText();
		System.out.println(wkt_takername);
		return wkt_takername;
	}

}
