package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {
	static WebDriver driver;
	static String nodeUrl;
	
	
	public static void main(String[] args) throws MalformedURLException {
	
		
	try {
			nodeUrl = "http://c0b4970c.ngrok.io/wd/hub";
			
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			
			//ChromeOptions options = new ChromeOptions();
			//options.merge(capabilities);
			
			driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("http://google.com");
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
	}

	}
}