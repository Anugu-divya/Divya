package pageElements;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	public void GoTo() throws IOException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement enterusername;

	@FindBy(xpath = "//input[@name='password']")
	WebElement enterpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbutton;

	public TimePage enterlogindetails(String username, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		enterusername.sendKeys(username);
		enterpassword.sendKeys(password);
		submitbutton.click();
		TimePage tp = new TimePage(driver);
		return tp;
	}
}
