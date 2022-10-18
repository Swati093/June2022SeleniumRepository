package testNGSession;

import org.testng.annotations.Test;

public class IgnoringTestcases {
	
	@Test(description=  "Searching a product test",priority=1)
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test(priority=2)
	public void logoTest() {
		System.out.println("Logo Test");
	}
	
	@Test(enabled = false,description = "Test payment made via CC and DC", priority=3)
	public void paymentTest() {
		System.out.println("Payment Test");
	}

}
