package pageElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customers {

	WebDriver driver;

	public Customers(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/i")
	WebElement customerdropdown;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement add1;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[1]")
	WebElement names;
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement desc;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement saves;

	public Projectadding customerclick() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		customerdropdown.click();
		add1.click();
		names.sendKeys("AnuguDivya");
		desc.sendKeys("yes");
		saves.click();
		Projectadding pa = new Projectadding(driver);
		return pa;
	}
}
