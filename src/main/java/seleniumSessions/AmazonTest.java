package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String browser="chrome";
		
		BrowserUtil brul=new BrowserUtil();
		brul.launchBrowser(browser);
		brul.launchURL("https://www.amazon.com");
		String title=brul.getPageTitle();
		if(title.contains("Amazon")) {
			System.out.println("Title is correct---PASS");
		}
		else {
			System.out.println("Title is incorrect---FAIL");
		}
		brul.getPageURL();
		brul.closeBrowser();
		
		
		
		
	}

}
