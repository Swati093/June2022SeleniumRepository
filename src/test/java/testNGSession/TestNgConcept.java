package testNGSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgConcept {
	
	//global pre condition
	//pre condition
	//test steps
		//data
		//assert--pass/fail
		//status
	//post conditions
	
	/*
	BS -- connectWithDB
	BT -- Create Test User
	BC -- launch the browser
		BM -- login to app
		add to cart Test
		AM -- Logout from app
		
		BM -- login to app
		payment Test
		AM -- Logout from app
		
		BM -- login to app
		search Test
		AM -- Logout from app
AC -- Delete Testr user
AT -- Close the browser
PASSED: addToCartTest
PASSED: paymentTest
PASSED: searchTest
AS -- Disconnect with DB

	 *Note: TCs get executed baed on alphabeticalorder if priority is not set.
	 */
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connectWithDB");
	}
	
	@BeforeTest
	public void createTestUser() {
		System.out.println("BT -- Create Test User");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch the browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	
	@Test
	public void addToCartTest() {
		System.out.println("add to cart Test");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("payment Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- Logout from app");
	}
	
	@AfterClass
	public void deleteUser() {
		System.out.println("AC -- Delete Testr user");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("AT -- Close the browser");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- Disconnect with DB");
	}
	
	
}
