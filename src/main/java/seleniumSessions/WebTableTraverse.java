package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTraverse {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		int rows=getRowCount();
//		System.out.println("Rows:"+rows);
//		
//		int cols=getColumnCount();
//		System.out.println("Columns:"+cols);
		
		

		//table[@id='customers']//tr[2]/td[1]
		//table[@id='customers']//tr[3]/td[1]
		//
		//table[@id='customers']//tr[7]/td[1]
		//getColumnInfo(3);
		
		getRowInfo(2,3);
		
		driver.close();
		
	}
	
	public static int getRowCount() {
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		return rowCount-1;
	}
	
	public static int getColumnCount() {
	return driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
	}
	
	
	public static void getColumnInfo(int col) {
		String beforeXpath="//table[@id='customers']//tr[";
		String afterXpath="]/td["+col+"]";
		ArrayList<String> colValue=new ArrayList<String>();
		
		for(int i=2;i<=getRowCount()+1;i++) {
			String absXpath=beforeXpath+i+afterXpath;
			//System.out.println(absXpath);
			String text=driver.findElement(By.xpath(absXpath)).getText();
			System.out.println(text);
			colValue.add(text);
		}
		
	
		
	}
public static void getRowInfo(int row,int colCount) {
	
	for(int i=1;i<=colCount;i++) {
	String row_Xpath="//table[@id='customers']//tr["+row+"]/td["+i+"]";
	//System.out.println(row_Xpath);
	List<WebElement> rowValue=driver.findElements(By.xpath(row_Xpath));
	for(WebElement e : rowValue) {
		String text=e.getText();
		System.out.println(text);
	}
		
	}
	
	
}}
