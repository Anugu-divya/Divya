package pageElements;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myrecords {

	WebDriver driver;

	public myrecords(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[2]")
	WebElement dropdown2;
	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")
	WebElement record;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	WebElement date;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement view3;

	public punchinorout myrecd() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		dropdown2.click();
		record.click();
		// date.clear();
		date.sendKeys(Keys.CONTROL + "a");
		date.sendKeys(Keys.DELETE);
		date.sendKeys("2024-12-30");
		view3.click();
		punchinorout pi = new punchinorout(driver);
		return pi;
	}

}
