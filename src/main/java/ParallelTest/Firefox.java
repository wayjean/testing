package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {

	WebDriver driver=null;
	@Test
	public void test2() throws Exception {
		System.out.println("Testing Firefox | "+Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\weijunw\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://youtube.com");
		driver.findElement(By.id("search")).sendKeys("2020 holiday");
		
		
}
	
	
}
