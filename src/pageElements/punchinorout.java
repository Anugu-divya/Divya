package pageElements;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class punchinorout {

	WebDriver driver;

	public punchinorout(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
	WebElement punchin;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement datetype;

	@FindBy(xpath = "//i[@class='oxd-icon bi-clock oxd-time-input--clock']")
	WebElement time;

	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement comment;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement out;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/i")
	WebElement inputdate;

	@FindBy(xpath = "//i[@class='oxd-icon bi-clock oxd-time-input--clock']")

	WebElement time1;

	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement comment1;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement in;

	public Employeerecords punchtime() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(2000);
		punchin.click();
		Thread.sleep(2000);
		datetype.sendKeys(Keys.CONTROL + "a");
		datetype.sendKeys(Keys.DELETE);
		datetype.sendKeys("2023-12-31");

		time.sendKeys(Keys.CONTROL + "a");
		time.sendKeys(Keys.DELETE);
		time.sendKeys("10:16 AM");

		comment.sendKeys("yes");
		out.click();

		inputdate.sendKeys(Keys.CONTROL + "a");
		inputdate.sendKeys(Keys.DELETE);
		inputdate.sendKeys("2023-12-01");
		time1.sendKeys(Keys.CONTROL + "a");
		time1.sendKeys(Keys.DELETE);
		time1.sendKeys("12:16 PM");
		comment1.sendKeys("done");
		in.click();
		Employeerecords empr = new Employeerecords(driver);
		return empr;

	}

}
