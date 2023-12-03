package utilities;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageElements.LoginPage;

public class Basetest {

	
	public WebDriver driver;
	
	public WebDriver intializebrowser() throws IOException { 
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	
	public LoginPage LaunchApplication() throws IOException {
		driver=intializebrowser();
		LoginPage lp = new LoginPage(driver);
		lp.GoTo();
		return lp;
	}
	
//	@AfterMethod
//	public void CloseBrowser() {
//		
//		driver.quit();
//	}
}
