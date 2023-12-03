package pageElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Attendancesummary {
	WebDriver driver;

	public Attendancesummary(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[3]")
	WebElement summary;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement nameenter3;
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	WebElement drop;
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
	WebElement drop2;
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[3]")
	WebElement drop3;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement datefrom3;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement dateto3;
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[1]")
	WebElement view123;

	public ProjectInfo attendance() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		summary.click();
		nameenter3.sendKeys("Charlie  Carter");
		SoftAssert sa1 = new SoftAssert();
		System.out.println("Charlie  Carter ");
		String Expectedtittle1 = "Invalid";
		String runtimetitle1 = driver.getTitle();
		System.out.println(runtimetitle1);
		sa1.assertEquals(runtimetitle1, Expectedtittle1);
		ProjectInfo pij = new ProjectInfo(driver);
		Select drop = new Select(driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")));
		drop.selectByIndex(0);
		Select drop2 = new Select(driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")));
		drop2.selectByIndex(0);
		Select drop3 = new Select(driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[3]")));
		drop3.selectByIndex(0);
		datefrom3.sendKeys(Keys.CONTROL + "a");
		datefrom3.sendKeys(Keys.DELETE);
		datefrom3.sendKeys("2024-12-03");
		dateto3.sendKeys(Keys.CONTROL + "a");
		dateto3.sendKeys(Keys.DELETE);
		dateto3.sendKeys("2024-12-04");
		view123.click();
		return pij;
	}

}
