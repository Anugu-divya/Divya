package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configuration {
	WebDriver driver;

	public Configuration(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[4]")
	WebElement config;
	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	WebElement toggle1;

	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")
	WebElement toggle2;

	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[3]")
	WebElement toggle3;

	public Projects configurates() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		config.click();
		toggle1.click();
		toggle2.click();
		toggle3.click();

		Projects pj = new Projects(driver);
		return pj;

	}

}
