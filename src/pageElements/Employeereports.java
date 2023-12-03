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

public class Employeereports {

	WebDriver driver;

	public Employeereports(WebDriver driverhere) {

		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
	WebElement employee;

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	WebElement hint;

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	WebElement hint1;
	@FindBy(xpath = "//div[@class='oxd-select-text--after']")
	WebElement act;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement datefrom1;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement dateto1;
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement toggle1;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement views1;

	public Attendancesummary reportsofemployee() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		employee.click();
		hint.sendKeys("ACME Ltd");
		SoftAssert sa = new SoftAssert();
		System.out.println("ACME Ltd");
		String Expectedtittle = "Select a Project ";
		String runtimetitle = driver.getTitle();
		System.out.println(runtimetitle);
		sa.assertEquals(runtimetitle, Expectedtittle);

		hint1.sendKeys("Charlie  Carter");
		SoftAssert sa1 = new SoftAssert();
		System.out.println("Charlie  Carter ");
		String Expectedtittle1 = "Invalid";
		String runtimetitle1 = driver.getTitle();
		System.out.println(runtimetitle1);
		sa1.assertEquals(runtimetitle1, Expectedtittle1);
		Select act = new Select(driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")));
		act.selectByIndex(0);

		datefrom1.sendKeys(Keys.CONTROL + "a");
		datefrom1.sendKeys(Keys.DELETE);
		datefrom1.sendKeys("2024-12-03");
		dateto1.sendKeys(Keys.CONTROL + "a");
		dateto1.sendKeys(Keys.DELETE);
		dateto1.sendKeys("2024-12-04");
		toggle1.click();
		views1.click();
		Attendancesummary as = new Attendancesummary(driver);
		return as;
	}

}
