package ParallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	
	WebDriver driver=null;

	
	@Test
	
	public void test1() throws Exception {
		System.out.println("Testing Chrome | "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\weijunw\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}
}